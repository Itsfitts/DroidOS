import os
import time
from google.generativeai import caching, GenerativeModel
import google.generativeai as genai

# CONFIG
API_KEY = os.getenv("GEMINI_API_KEY")
REPO_MIX_PATH = "repomix.txt" # Your big context file
CACHE_TTL_MINUTES = 60

genai.configure(api_key=API_KEY)

def get_or_create_cache():
    # 1. Check if we already have a cache for this file (basic check)
    # In a real tool, you'd save the cache_name to a temp file to reuse across runs
    
    print(f"Uploading {REPO_MIX_PATH} to Gemini Cache...")
    # Read file
    with open(REPO_MIX_PATH, "r", encoding="utf-8") as f:
        content = f.read()

    # Create Cache
    cache = caching.CachedContent.create(
        model="models/gemini-1.5-pro-002", # Or latest model
        display_name="project-architect-cache", 
        system_instruction="You are a Senior Software Architect. Output strictly formatted implementation plans.",
        contents=[content],
        ttl=datetime.timedelta(minutes=CACHE_TTL_MINUTES),
    )
    print(f"Cache created! Name: {cache.name}")
    return cache

def main():
    # Setup Cache
    cache = get_or_create_cache()
    
    # Initialize Model using the Cache
    model = GenerativeModel.from_cached_content(cached_content=cache)
    chat = model.start_chat()

    print("\n--- ARCHITECT MODE (Cached) ---\n")
    while True:
        user_input = input("Architect> ")
        if user_input.lower() in ["exit", "quit"]:
            break
        
        # Send message (cheap! only pays for user_input tokens)
        response = chat.send_message(user_input)
        print("\n" + response.text + "\n")

        # Optional: Save last output to plan.md automatically
        if "plan" in user_input.lower():
            with open("plan.md", "w") as f:
                f.write(response.text)
            print("[Saved response to plan.md]")

if __name__ == "__main__":
    import datetime
    main()


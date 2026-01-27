import sys
import re
import os

# CONFIG: Set your project root
PROJECT_ROOT = os.path.expanduser("~/projects/DroidOS")

def find_file(filename):
    if os.path.exists(filename): return filename, None
    target_name = os.path.basename(filename)
    matches = []
    for root, dirs, files in os.walk(PROJECT_ROOT):
        if target_name in files: matches.append(os.path.join(root, target_name))
    if len(matches) == 0: return None, f"❌ Not found: '{target_name}'"
    if len(matches) > 1: return None, f"⚠️  Ambiguous: found {len(matches)} files named '{target_name}'"
    return matches[0], None

def sanitize_text(text):
    """Cleans up spaces, markdown fences, and UI artifacts."""
    text = text.replace('\xa0', ' ') # Fix non-breaking spaces
    text = re.sub(r"^```\w*\n", "", text) # Remove opening fence
    text = text.rstrip("`").strip() # Remove closing fence
    
    garbage_lines = {
        "code kotlin", "code java", "code python", 
        "downloadcontent_copy", "expand_less", "expand_more"
    }
    
    lines = text.split('\n')
    clean_lines = []
    for line in lines:
        if line.strip().lower() in garbage_lines: continue
        clean_lines.append(line)
        
    return "\n".join(clean_lines)

def apply_changes(plan_file):
    if not os.path.exists(plan_file): 
        print(f"❌ Plan file not found.")
        return
    
    with open(plan_file, 'r', encoding='utf-8') as f: content = f.read()

    pattern = re.compile(
        r"FILE_UPDATE:\s*(.+?)\n"
        r".*?REASON:\s*(.+?)\n"
        r".*?SEARCH_BLOCK:\s*(.*?)\n\s*"
        r"REPLACE_BLOCK:\s*(.*?)(?=\nFILE_UPDATE:|$)",
        re.DOTALL
    )

    matches = pattern.findall(content)
    
    if not matches: 
        print("⚠️  No updates found. Check syntax.")
        return

    print(f"🔎 Scanning {len(matches)} updates...\n")
    
    applied_updates = []
    failed_updates = []

    for raw_filename, reason, search_block, replace_block in matches:
        raw_filename = raw_filename.strip()
        reason = reason.strip()
        
        full_path, error = find_file(raw_filename)
        
        if error:
            print(error)
            failed_updates.append((raw_filename, reason, "File not found"))
            continue

        search_block = sanitize_text(search_block)
        replace_block = sanitize_text(replace_block)

        with open(full_path, 'r', encoding='utf-8') as f: file_content = f.read()

        # Try Exact Match
        if search_block in file_content:
            new_content = file_content.replace(search_block, replace_block)
            with open(full_path, 'w', encoding='utf-8') as f: f.write(new_content)
            print(f"✅ Applied: {os.path.basename(full_path)}")
            applied_updates.append((os.path.basename(full_path), reason))
        
        # Try Fuzzy Match
        elif search_block.strip() in file_content:
            new_content = file_content.replace(search_block.strip(), replace_block)
            with open(full_path, 'w', encoding='utf-8') as f: f.write(new_content)
            print(f"✅ Applied (Fuzzy): {os.path.basename(full_path)}")
            applied_updates.append((os.path.basename(full_path), reason))
            
        else:
            print(f"❌ FAILED: {os.path.basename(full_path)}")
            failed_updates.append((os.path.basename(full_path), reason, "Anchor text not found"))

    # --- SUMMARY REPORT ---
    print("\n" + "="*50)
    print("📝 GIT COMMIT SUMMARY (Successful)")
    print("="*50)
    if applied_updates:
        for fname, reason in applied_updates:
            print(f"* {fname}: {reason}")
    else:
        print("(No changes applied)")

    if failed_updates:
        print("\n" + "!"*50)
        print("⚠️  MISSED UPDATES (Action Required)")
        print("!"*50)
        for fname, reason, error in failed_updates:
            print(f"❌ {fname}")
            print(f"   Reason: {reason}")
            print(f"   Error:  {error}")
            print("-" * 30)

if __name__ == "__main__":
    if len(sys.argv) < 2: print("Usage: python builder.py <plan.md>")
    else: apply_changes(sys.argv[1])

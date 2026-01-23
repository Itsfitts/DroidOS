import os
import re

# Configuration
INPUT_FILE = "restore_source.md"

def restore_files():
    if not os.path.exists(INPUT_FILE):
        print(f"Error: {INPUT_FILE} not found. Please create it and paste the Repomix content.")
        return

    print(f"Reading {INPUT_FILE}...")
    
    with open(INPUT_FILE, 'r', encoding='utf-8') as f:
        lines = f.readlines()

    current_file_path = None
    collecting_code = False
    code_buffer = []
    files_restored = 0
    
    # Regex to find file headers. Matches "## File: path/to/file"
    file_header_pattern = re.compile(r"^## File: (.+)")

    for i, line in enumerate(lines):
        # 1. Check for File Header
        match = file_header_pattern.match(line)
        if match:
            # If we were collecting code for a previous file, allow the loop to close it naturally
            # But usually, the closing ``` happens before the next ## File
            current_file_path = match.group(1).strip()
            collecting_code = False
            code_buffer = []
            print(f"Found target: {current_file_path}")
            continue

        # 2. Check for Code Block Markers
        # We look for the start ``` (sometimes with lang) and end ```
        if line.strip().startswith("```"):
            if not current_file_path:
                continue

            if not collecting_code:
                # Start of block
                collecting_code = True
                continue
            else:
                # End of block - WRITE FILE
                collecting_code = False
                
                # Ensure directory exists
                dir_name = os.path.dirname(current_file_path)
                if dir_name:
                    os.makedirs(dir_name, exist_ok=True)
                
                # Write content
                try:
                    with open(current_file_path, 'w', encoding='utf-8') as out_f:
                        out_f.write("".join(code_buffer))
                    print(f"  -> Restored: {current_file_path}")
                    files_restored += 1
                except Exception as e:
                    print(f"  -> Error writing {current_file_path}: {e}")
                
                current_file_path = None # Reset
                code_buffer = []
                continue

        # 3. Collect Code
        if collecting_code:
            code_buffer.append(line)

    print(f"\nDone! Restored {files_restored} files.")

if __name__ == "__main__":
    restore_files()

# Remove Python Venv from Git Commit

We are undoing the massive commit containing the Python binaries and configuring git to ignore them, then re-committing the valid code changes.

## 1. Undo the Last Commit

Run this command in the terminal to undo the commit `59733c1` but keep your code changes in the folder. This will unstage all files.

```bash
git reset HEAD~1


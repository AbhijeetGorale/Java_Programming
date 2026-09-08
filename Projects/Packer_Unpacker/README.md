# 📦 File Packer & Unpacker in Java

## Overview
This project demonstrates a simple **File Packer and Unpacker utility** written in Java.  
- **Packer**: Combines multiple files from a folder into a single packed file.  
- **Unpacker**: Extracts the packed file back into the original files.  

It’s similar to a basic archiving tool (like `.zip`), but without compression — purely concatenation with headers.

---

## 🔧 How It Works
### Packer
- Takes a folder name and a destination packed file name.
- For each file in the folder:
  - Creates a **100-byte header** containing:
    - File name
    - File size (in bytes)
  - Pads the header with spaces to make it exactly 100 bytes.
  - Writes the header into the packed file.
  - Appends the file’s raw data.

### Unpacker
- Reads the packed file sequentially.
- For each 100-byte header:
  - Extracts the file name and size.
  - Creates a new file with the given name.
  - Reads the specified number of bytes (file content).
  - Writes them into the new file.
- Repeats until all files are restored.

---

## 📂 Project Structure
├── Packer.java      # Packs files from a folder into one file
├── Unpacker.java    # Unpacks files from the packed file
└── README.md        # Documentation


---

## ▶️ Usage
### Compile
```bash
javac Packer.java
javac Unpacker.java


Run Packer
bash
java Packer
Enter the folder name containing files to pack.

Enter the name of the packed file (e.g., packed.dat).

Run Unpacker
bash
java Unpacker
Enter the packed file name (e.g., packed.dat).

The original files will be recreated in the current directory.

📝 Example
Suppose your folder MyFolder contains:

file1.txt (200 bytes)

file2.jpg (5000 bytes)

java Packer
Enter Folder name : MyFolder
Enter the name of packed file : packed.dat

Then unpack:

bash
java Unpacker
Enter the name of packed file : packed.dat

Output:

Code
Header is : file1.txt 200 ...
File name : file1.txt
File size : 200
Header is : file2.jpg 5000 ...
File name : file2.jpg
File size : 5000
Files file1.txt and file2.jpg are restored in the current directory.

⚠️ Limitations
No compression — files are stored as raw bytes.

Headers are fixed at 100 bytes.

Files are restored in the current directory only.

Duplicate file names may overwrite existing files.

🚀 Future Improvements
Add compression (e.g., GZIP).

Support subdirectories.

Add error handling for corrupted packed files.

Provide a GUI for easier usage.

Author :
Developed by Abhijeet Gorale ✨

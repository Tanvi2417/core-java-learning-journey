# ☕ Day 17 - File Handling

## 📚 Introduction

File handling in Java is used to create, read, write, update, and delete files.

It allows Java applications to store and retrieve data from files.

---

## 📖 File

A file is a collection of data stored on a storage device.

Java provides several classes and APIs for working with files.

---

## 📖 File Handling

File handling allows a Java program to interact with files stored in the system.

Common file operations include:

- Creating a file
- Writing data
- Reading data
- Appending data
- Copying files
- Deleting files
- Getting file information

---

## 📖 java.io Package

The `java.io` package provides classes for input and output operations.

It contains classes that can be used for reading and writing data.

Some commonly used classes include:

- File
- FileReader
- FileWriter
- BufferedReader
- BufferedWriter
- FileInputStream
- FileOutputStream

---

## 📖 File Class

The File class represents a file or directory path.

It can be used to check whether a file exists and obtain information such as its name, location, and size.

---

## 📖 FileReader

FileReader is used to read character data from a file.

It is suitable for reading text-based files.

---

## 📖 FileWriter

FileWriter is used to write character data into a file.

It can also be used to append data to an existing file.

---

## 📖 BufferedReader

BufferedReader is used to read text efficiently.

It provides buffering and allows text to be read line by line.

---

## 📖 BufferedWriter

BufferedWriter is used to write text efficiently.

It reduces the number of direct write operations by using a buffer.

---

## 📖 Byte Stream

Byte streams are used to handle data in the form of bytes.

They are commonly used for binary data such as images, audio files, and videos.

---

## 📖 Character Stream

Character streams are designed to handle character-based data.

They are commonly used for text files.

---

## 📖 Input and Output

### Input

Input means receiving data into a program.

For example, reading data from a file.

### Output

Output means sending data from a program to an external destination.

For example, writing data into a file.

---

## 📖 File Creation

Java can create a new file using file-handling classes.

If the file already exists, the program can check its existence before creating it.

---

## 📖 Reading a File

Reading a file means retrieving the data stored inside it.

Java provides different classes for reading character-based and byte-based data.

---

## 📖 Writing to a File

Writing means storing data inside a file.

Existing file content can be replaced depending on how the file is opened.

---

## 📖 Appending Data

Appending means adding new data at the end of an existing file without removing its previous content.

---

## 📖 File Deletion

A file can be removed from the system using Java file-handling functionality.

The program should check whether the file exists before attempting deletion.

---

## 📖 Exception Handling in File Handling

File operations can produce exceptions because of problems such as:

- File not found
- Permission problems
- Input/output failures
- Invalid file paths

Therefore, file-handling operations commonly require appropriate exception handling.

---

## 📖 Character Stream vs Byte Stream

| Feature | Character Stream | Byte Stream |
|---------|------------------|-------------|
| Data | Characters | Bytes |
| Common use | Text files | Binary files |
| Examples | FileReader, FileWriter | FileInputStream, FileOutputStream |

---

## ✨ Advantages of File Handling

- Provides permanent data storage.
- Allows programs to store large amounts of data.
- Allows data to be reused later.
- Makes it possible to exchange data between applications.
- Supports reading and writing external data.

---

## 🌍 Real-World Examples

File handling is used in many applications.

Examples include:

- Saving student records
- Storing application logs
- Reading configuration files
- Saving reports
- Storing text documents
- Processing CSV files

---

## ⚠️ Important Points

- File handling is used for storing and retrieving data.
- The `java.io` package provides many file-handling classes.
- The File class provides information about files and directories.
- FileReader is used for character-based reading.
- FileWriter is used for character-based writing.
- BufferedReader can efficiently read text.
- BufferedWriter can efficiently write text.
- Byte streams are useful for binary data.
- Character streams are useful for text data.
- File operations may require exception handling.

---

## 🎯 Learning Outcome

After completing this module, you will be able to:

- Understand file handling in Java.
- Create files.
- Read files.
- Write data to files.
- Append data to files.
- Copy files.
- Delete files.
- Get file information.
- Understand character streams.
- Understand byte streams.
- Understand the importance of exception handling in file operations.
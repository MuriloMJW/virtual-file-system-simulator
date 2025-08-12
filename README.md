# Virtual File System

This project is a graphical simulator for a **virtual file system** implemented in Java. It allows users to understand the basic concepts of file storage, including file allocation, fragmentation, and management using a **FAT-like (File Allocation Table) structure**.

<img width="1871" height="1335" alt="Screenshot_2" src="https://github.com/user-attachments/assets/e1b098f8-4344-4232-8da0-9a01239e33ee" />

---

## Features

* **Create and format a virtual disk** with customizable cluster sizes.
* **Add, delete, and extract files** to and from the virtual disk.
* Visualize file allocation on a block-based grid, with different colors representing different files.
* Log all disk operations and file management actions.
* Load and save the state of the virtual disk for later use.
* View a directory-like table of all files stored on the disk.

---

## How it Works

The application simulates a storage device as an array of objects (`Arquivo[] discoVirtual`). A central **File Allocation Table (FAT)**, represented by the `Fat` class, keeps track of all files and their corresponding blocks. Each file has an **index block** (`Index`) that points to its data blocks, which are scattered throughout the disk.

The graphical user interface (`DiscoUI`) uses `JProgressBar` components to visually represent each block on the disk, making it easy to see how files are stored and deleted.

---

## Technologies

* **Java**
* **Swing** for the graphical user interface.
* File I/O for persistent disk storage.

---


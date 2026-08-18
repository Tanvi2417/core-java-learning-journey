# ☕ Day 08 - Arrays

## 📚 Introduction

An array is a collection of elements of the same data type stored under a single variable name. Arrays are used to store and manage multiple values efficiently instead of creating separate variables for each value.

---

## 📖 Array

An array has a fixed size, which is determined when the array is created. Each element is stored at a specific index, and indexing starts from `0`.

Arrays can store primitive data types as well as references to objects.

---

## 📖 Types of Arrays

### 1. One-Dimensional Array

A one-dimensional array stores elements in a single sequence. It is commonly used for storing lists of values such as marks, numbers, or names.

### 2. Multidimensional Array

A multidimensional array contains arrays as its elements. A two-dimensional array is commonly represented in the form of rows and columns and can be used to represent matrices or tables.

---

## 📖 Important Concepts

### Array Index

An index identifies the position of an element in an array. The first element is located at index `0`, while the last element is located at `length - 1`.

### Array Length

The length of an array represents the total number of elements it can contain. Once an array is created, its size cannot be changed.

### Array Traversal

Array traversal means visiting each element of an array one by one. Loops are commonly used to traverse arrays.

### Array Initialization

Array initialization means assigning values to the elements of an array. Values can be assigned when the array is created or after its creation.

### Default Values

When an array is created without explicitly assigning values, Java automatically assigns default values based on the data type.

For example, numeric types receive `0`, `boolean` receives `false`, and reference types receive `null`.

---

## ⚠️ Important Point

Arrays have a fixed size. Once an array is created, its size cannot be increased or decreased.

Trying to access an index outside the valid range results in an `ArrayIndexOutOfBoundsException`.

---

## ✨ Advantages

- Stores multiple values using a single variable.
- Provides fast access to elements using indexes.
- Makes repetitive data processing easier.
- Works effectively with loops.
- Provides a foundation for understanding collections and data structures.

---

## 🎯 Learning Outcome

After completing this module, you will be able to:

- Understand the purpose and structure of arrays.
- Create and work with one-dimensional arrays.
- Understand multidimensional arrays.
- Access elements using indexes.
- Traverse arrays using loops.
- Perform common operations such as searching, counting, reversing, and finding the largest or smallest element.
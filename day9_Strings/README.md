# ☕ Day 09 - Strings

## 📚 Introduction

A String in Java represents a sequence of characters. Strings are widely used for storing and manipulating text such as names, messages, addresses, and other textual data.

In Java, String is a class provided by the `java.lang` package. Strings are objects rather than primitive data types.

---

## 📖 String Creation

Strings can be created using string literals or by using the `String` class constructor.

When a string literal is created, Java can store it in the String Pool to improve memory efficiency and allow reuse of identical string values.

---

## 📖 String Immutability

Strings in Java are immutable, which means that once a String object is created, its value cannot be changed.

When an operation appears to modify a String, Java creates a new String object instead of changing the original object.

Immutability makes Strings safe to use and helps Java manage String objects efficiently.

---

## 📖 String Pool

The String Pool is a special area of memory used by Java to store string literals.

If the same string literal is created more than once, Java can reuse the existing object from the String Pool instead of creating another object.

---

## 📖 Important String Operations

Java provides many methods for working with strings, including operations for:

- Finding the length of a string
- Accessing individual characters
- Comparing strings
- Combining strings
- Searching for text
- Extracting portions of a string
- Changing letter case
- Replacing characters or text
- Removing unnecessary spaces

---

## 📖 String Comparison

Strings should generally be compared using methods such as `equals()` when the goal is to compare their actual content.

The `==` operator compares object references rather than the contents of String objects.

The `equalsIgnoreCase()` method can be used when the comparison should ignore differences in uppercase and lowercase letters.

---

## 📖 String Concatenation

String concatenation means joining two or more strings together to form a single string.

Java supports concatenation using the `+` operator and methods provided by the String class.

---

## 📖 String and Character Array

A String can be converted into a character array. This allows individual characters to be accessed and processed using array-based operations.

---

## ✨ Advantages

- Easy to store and manipulate text.
- Provides many built-in methods for text processing.
- Immutable nature improves security and reliability.
- String Pool helps reduce unnecessary object creation.
- Widely used throughout Java applications.

---

## 🎯 Learning Outcome

After completing this module, you will be able to:

- Understand Strings and their characteristics.
- Understand String immutability.
- Understand the String Pool.
- Compare and manipulate String objects.
- Perform common String operations.
- Process individual characters within a String.
- Solve basic String-based programming problems.
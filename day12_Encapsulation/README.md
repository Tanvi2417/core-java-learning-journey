# ☕ Day 12 - Encapsulation

## 📚 Introduction

Encapsulation is one of the fundamental concepts of Object-Oriented Programming in Java.

It means combining data and the methods that operate on that data within a single class while controlling direct access to the internal data.

---

## 📖 Data Hiding

Data hiding means restricting direct access to the internal data of an object.

In Java, data hiding is commonly achieved by declaring instance variables as private.

The data can then be accessed or modified through controlled methods.

---

## 📖 Access Modifiers and Encapsulation

Access modifiers help control the visibility of class members.

The `private` access modifier is commonly used with encapsulated data because private members cannot be accessed directly from outside their class.

---

## 📖 Getters

A getter is a method used to retrieve the value of a private variable.

It provides controlled access to the data without exposing the variable directly.

---

## 📖 Setters

A setter is a method used to modify the value of a private variable.

Setters can contain validation rules before allowing a value to be changed.

---

## 📖 Controlled Access

Encapsulation allows a class to decide how its internal data can be accessed or modified.

For example, a bank account can prevent an invalid negative deposit or withdrawal by applying validation inside its methods.

---

## 📖 Validation

One important advantage of encapsulation is that validation can be applied before modifying an object's data.

This helps prevent invalid or unwanted values from entering an object's state.

---

## 📖 Benefits of Encapsulation

### Data Protection

Internal data is protected from direct and uncontrolled access.

### Validation

The class can validate values before modifying its data.

### Maintainability

Internal implementation can be changed without requiring changes to the code that uses the class.

### Flexibility

The class can control how its data is accessed and modified.

### Security

Restricting direct access helps protect important information and prevents unwanted modifications.

---

## ✨ Real-World Example

A bank account is a common example of encapsulation.

The account balance should not be directly changed by external code.

Instead, operations such as deposit and withdrawal can control how the balance is modified and can apply appropriate validation.

---

## 🎯 Learning Outcome

After completing this module, you will be able to:

- Understand the concept of encapsulation.
- Understand data hiding.
- Understand the role of private variables.
- Understand getters and setters.
- Control access to object data.
- Apply validation to object data.
- Understand the practical benefits of encapsulation.
# ☕ Day 13 - Inheritance

## 📚 Introduction

Inheritance is an Object-Oriented Programming concept in Java that allows one class to acquire the properties and behaviors of another class.

It promotes code reusability and establishes a relationship between classes.

---

## 📖 Parent Class

The class whose properties and methods are inherited is called the parent class.

It is also commonly known as the superclass or base class.

---

## 📖 Child Class

The class that inherits properties and methods from another class is called the child class.

It is also commonly known as the subclass or derived class.

---

## 📖 Code Reusability

One of the major benefits of inheritance is code reusability.

A child class can use the existing functionality of its parent class instead of writing the same functionality again.

---

## 📖 Types of Inheritance

### 1. Single Inheritance

Single inheritance occurs when one child class inherits from one parent class.

### 2. Multilevel Inheritance

Multilevel inheritance occurs when a class inherits from another child class, creating a chain of inheritance.

For example:

Grandparent → Parent → Child

### 3. Hierarchical Inheritance

Hierarchical inheritance occurs when multiple child classes inherit from the same parent class.

For example:

        Vehicle
        /     \
      Car     Bike

---

## 📖 Multiple Inheritance

Java does not support multiple inheritance through classes.

This means a class cannot directly extend multiple classes.

Java uses interfaces to provide a way to achieve multiple-inheritance-like behavior.

---

## 📖 IS-A Relationship

Inheritance represents an IS-A relationship between classes.

For example:

A Dog IS-A Animal.

A Car IS-A Vehicle.

---

## 📖 Super Keyword

The `super` keyword is used to refer to members of the immediate parent class.

It can be used to access parent class variables, methods, and constructors.

---

## 📖 Constructor and Inheritance

Constructors are not inherited by child classes.

However, when a child object is created, the constructor of the parent class is executed before the constructor of the child class.

This helps initialize the inherited part of the object.

---

## 📖 Method Inheritance

A child class can use accessible methods inherited from its parent class.

The child class can also define its own additional methods.

---

## 📖 Advantages of Inheritance

- Promotes code reusability.
- Reduces duplicate code.
- Creates a clear relationship between classes.
- Makes programs easier to maintain.
- Supports method overriding.
- Provides the foundation for runtime polymorphism.

---

## ⚠️ Important Points

- Java supports single, multilevel, and hierarchical inheritance through classes.
- Java does not support multiple inheritance through classes.
- Private members of a parent class are not directly accessible in the child class.
- Constructors are not inherited.
- Static methods and variables belong to the class, although inherited members can be accessed according to Java's rules.
- The `super` keyword refers to the immediate parent class.

---

## 🎯 Learning Outcome

After completing this module, you will be able to:

- Understand inheritance in Java.
- Understand parent and child classes.
- Understand code reusability.
- Identify different types of inheritance.
- Understand the IS-A relationship.
- Understand the purpose of the `super` keyword.
- Understand constructor execution in inheritance.
- Understand how inherited methods are used.
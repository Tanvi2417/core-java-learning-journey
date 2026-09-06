# ☕ Day 14 - Polymorphism

## 📚 Introduction

Polymorphism is one of the fundamental concepts of Object-Oriented Programming in Java.

The word polymorphism means "many forms". It allows the same method name or reference to represent different behaviors depending on the situation.

---

## 📖 Types of Polymorphism

Java mainly supports two types of polymorphism:

1. Compile-Time Polymorphism
2. Runtime Polymorphism

---

## 📖 Compile-Time Polymorphism

Compile-time polymorphism is achieved through method overloading.

The compiler determines which overloaded method should be called based on the method parameters.

---

## 📖 Method Overloading

Method overloading occurs when a class contains multiple methods with the same name but different parameter lists.

The parameters can differ in:

- Number of parameters
- Type of parameters
- Order of parameters

Changing only the return type does not create method overloading.

---

## 📖 Constructor Overloading

A class can have multiple constructors with different parameter lists.

Constructor overloading allows objects to be initialized in different ways.

---

## 📖 Runtime Polymorphism

Runtime polymorphism is achieved through method overriding.

The method that should execute is determined during program execution based on the actual object.

---

## 📖 Method Overriding

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

The method in the child class should follow the rules required for overriding.

---

## 📖 Dynamic Method Dispatch

Dynamic method dispatch is the mechanism through which Java determines at runtime which overridden method should execute.

A parent-class reference can refer to an object of a child class.

The actual object determines which overridden method is executed.

---

## 📖 Compile-Time vs Runtime Polymorphism

| Feature | Compile-Time | Runtime |
|---------|---------------|---------|
| Main concept | Method Overloading | Method Overriding |
| Decision | During compilation | During execution |
| Relationship | Usually within the same class | Parent-child relationship |
| Also called | Static Polymorphism | Dynamic Polymorphism |

---

## 📖 @Override Annotation

The `@Override` annotation indicates that a method is intended to override a method from a parent class.

It helps the compiler detect incorrect overriding.

---

## ✨ Advantages of Polymorphism

- Provides flexibility.
- Supports code reusability.
- Reduces code duplication.
- Makes programs easier to extend.
- Supports loose coupling.
- Makes object-oriented programs more flexible.

---

## 🎯 Learning Outcome

After completing this module, you will be able to:

- Understand polymorphism.
- Understand compile-time polymorphism.
- Understand method overloading.
- Understand constructor overloading.
- Understand runtime polymorphism.
- Understand method overriding.
- Understand dynamic method dispatch.
- Differentiate between compile-time and runtime polymorphism.
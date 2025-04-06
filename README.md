# 📘 Java Notes – Core Concepts + Java 9–21 Features

---

## 📚 Table of Contents

- [1. Core Java Concepts](#1-core-java-concepts)
- [2. Java 9 to 21 Features](#2-java-9-to-21-features)

---

## 1. Core Java Concepts

### 🔹 Java Overview
> Java is a high-level, class-based, object-oriented programming language. It is designed to have as few implementation dependencies as possible.

---

### 🔹 JDK vs JRE vs JVM
- **JDK**: Java Development Kit – tools to develop Java applications.
- **JRE**: Java Runtime Environment – runs Java applications.
- **JVM**: Java Virtual Machine – converts bytecode to machine code.

---

### 🔹 OOP Concepts
- **Encapsulation** – binding data and methods into a single unit.
- **Inheritance** – acquiring properties of another class.
- **Polymorphism** – performing actions in many forms.
- **Abstraction** – hiding internal implementation.

---

### 🔹 Data Types
- **Primitive**: int, float, double, char, boolean
- **Non-Primitive**: String, Arrays, Classes, Interfaces

---

### 🔹 Control Statements
- `if`, `else`, `switch`
- `for`, `while`, `do-while`
- `break`, `continue`, `return`

---

### 🔹 Exception Handling
```java
try {
    // risky code
} catch (Exception e) {
    // error handling
} finally {
    // cleanup
}
```

---

### 🔹 Collections Framework
| Interface | Implementation |
|-----------|----------------|
| List      | ArrayList, LinkedList |
| Set       | HashSet, TreeSet |
| Map       | HashMap, TreeMap |
| Queue     | PriorityQueue, Deque |

---

## 2. Java 9 to 21 Features

### 🔹 Java 9
- **JShell**: Interactive shell
- **Modules**
- **Stream API Enhancements**

---

### 🔹 Java 10
- **`var` keyword** for local variable type inference

---

### 🔹 Java 11
- **New String methods**: `isBlank()`, `lines()`, `strip()`, `repeat()`
- **Standard HTTP Client**

---

### 🔹 Java 12
- **Switch Expressions (preview)**

---

### 🔹 Java 13–14
- **Text Blocks** using `"""` syntax
- **Pattern Matching for instanceof**

---

### 🔹 Java 15–16
- **Records**: Immutable data classes
- **Sealed Classes**: Controlled inheritance

---

### 🔹 Java 17 (LTS)
- Finalized features: Sealed Classes, Pattern Matching, Records, Switch Expressions

---

### 🔹 Java 18–20
- **Simple Web Server**
- **Record Patterns** (Preview)
- **Scoped Values**

---

### 🔹 Java 21 (LTS)
- **Virtual Threads**
- **Pattern Matching for Switch**
- **Record Patterns (Standard)**
- **Sequenced Collections**

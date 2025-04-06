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
### 🔹 Java Memory Management & Garbage Collections
- **Garbage Collections**

---

### 🔹 Data Types & Variable
- **Primitive**: int, float, double, char, boolean
- **Non-Primitive**: String, Arrays, Classes, Interfaces
- **Type Casting**: Implicit (widening), Explicit (narrowing)
- **Wrapper Classes**: Integer, Boolean, Unboxing, Autoboxing

---
### 🔹 Operators
- **Operators**: +, -, *, /, %, ++, --, &&, ||, !, ==, !=, etc.

---

### 🔹 Arrays and Strings
- **Array** : 1D & 2D Arrays
- **String Handling**: String, StringBuilder, StringBuffer, Common Methods: .length(), .charAt(), .substring(), .indexOf(), .equals(), etc.

  
---
### 🔹 Control Statements
- `if`, `else`, `switch`
- `for`, `while`, `do-while`
- `break`, `continue`, `return`

---

### 🔹 Packages and Access Modifiers
- **Packages**: Built-in (java.util, java.io), Custom packages
- **Access Modifiers**: private, default, protected, public

---

### 🔹 OOP Concepts
- **Class & Object** -- what is class & object.
- **Encapsulation** – binding data and methods into a single unit.
- **Inheritance** – acquiring properties of another class.
- **Polymorphism** – performing actions in many forms.
- **Abstraction** – hiding internal implementation.
- **Interface** -- Including Java 9 features.
- **Inner Classes**: static vs non-static inner classes, Local Inner class
- **Static vs Non-Static** : 

---

### 🔹 Exception Handling
- **Types**: Checked & Unchecked.
- **Keywords**: try, catch, finally, throw, throws.
- **Try with Resources**:
- **Custom Exceptions**


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
### 🔹 Multithreading
- **Thread Creation**:
- **Thread class**
- **Runnable interface**
- **Thread Lifecycle**
- **Synchronization**
  Thread.sleep(), join(), yield()

---
### 🔹 File Handling (java.io & java.nio)
- **File, FileReader, FileWriter, BufferedReader**
- **Scanner Class**
- **Serialization & Deserialization**

---
### 🔹 Java 8 Features
- **Lambda Expressions**
- **Functional Interfaces**
- **Streams API**
- **Optional Class**
- **Method References**

---
### Annotations and Enums
- **Built-in Annotations: @Override, @Deprecated, @SuppressWarnings**
- **Custom Annotations**
- **Enum Basics & Use Cases**

---

## 2. Java 9 to 21 Features

### 🔹 Java 9
- **JShell**: Interactive shell
- **Modules**: Organize code into modules (module-info.java)
- **Stream API Enhancements**: takeWhile(), dropWhile(), iterate()

---

### 🔹 Java 10
- **`var` keyword** for local variable type inference

---

### 🔹 Java 11
- **New String methods**: `isBlank()`, `lines()`, `strip()`, `repeat()`
- **var in** lambda parameters
- **Standard HTTP Client**: HTTP Client API (Standard, replaces HttpURLConnection)
- **Launch Single-File Source-Code Programs**

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
- Enhanced Pseudo-Random Number Generators

---

### 🔹 Java 18–20
- **Simple Web Server**: jwebserver command
- **Record Patterns** (Preview)
- **Scoped Values**

---

### 🔹 Java 21 (LTS)
- **Virtual Threads**
- **Pattern Matching for Switch**
- **Record Patterns (Standard)**
- **Sequenced Collections**

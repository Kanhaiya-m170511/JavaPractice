This document provides a detailed explanation of **Data Types**, **Variables**, **Type Casting**, and **Wrapper Classes** in Java.

---

## **1. Data Types in Java**

In Java, **data types** are divided into two categories: **Primitive** and **Non-Primitive**.

### **Primitive Data Types**
Primitive data types are the most basic data types in Java. They are predefined by Java and represent raw values.

#### **1.1 int**
- **Size**: 4 bytes
- **Default Value**: 0
- **Description**: Represents integers (whole numbers) without decimals.

#### **1.2 float**
- **Size**: 4 bytes
- **Default Value**: 0.0f
- **Description**: Represents single-precision floating-point numbers (decimals).

#### **1.3 double**
- **Size**: 8 bytes
- **Default Value**: 0.0d
- **Description**: Represents double-precision floating-point numbers. Used for more precise decimal values.

#### **1.4 char**
- **Size**: 2 bytes
- **Default Value**: '\u0000'
- **Description**: Represents a single 16-bit Unicode character.

#### **1.5 boolean**
- **Size**: 1 bit
- **Default Value**: false
- **Description**: Represents a true or false value.

---

### **Non-Primitive Data Types**
Non-primitive data types are more complex and are defined by the user. They are objects and can store multiple values.

#### **1.6 String**
- **Description**: Represents a sequence of characters. Strings are immutable in Java, meaning once a string is created, its value cannot be changed.

#### **1.7 Arrays**
- **Description**: A collection of similar types of elements stored in contiguous memory locations. Arrays can hold multiple values of the same type (either primitive or non-primitive).

#### **1.8 Classes**
- **Description**: A blueprint for creating objects, defining the data and methods that the objects will contain.

#### **1.9 Interfaces**
- **Description**: A reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields.

---

## **2. Variables in Java**

Variables are used to store data in Java. There are different types of variables based on their scope and lifetime:

### **2.1 Local Variables**
- Declared inside a method or a block.
- Cannot be accessed outside the method or block.
- They are not initialized with a default value.

### **2.2 Instance Variables**
- Declared within a class but outside any method, constructor, or block.
- Every object has its own copy of instance variables.

### **2.3 Class Variables (Static Variables)**
- Declared with the `static` keyword.
- Only one copy of a class variable exists, shared by all objects of the class.

---

## **3. Type Casting in Java**

**Type Casting** is the process of converting one data type to another. In Java, there are two types of type casting:

### **3.1 Implicit Type Casting (Widening)**
- **Description**: It automatically converts a smaller type to a larger type.
- **Example**:
```java
int num = 10;
double result = num;  // int to double (widening)

# Deep Dive into JVM (Java Virtual Machine)

## 🔍 What is JVM?

The **Java Virtual Machine (JVM)** is part of the Java Runtime Environment (JRE) and provides the runtime environment necessary to execute Java bytecode. It enables Java's platform independence by abstracting the underlying hardware and operating system.

---

## 🧱 Core Components of JVM

### 1. Class Loader
Responsible for loading class files.

#### Types of Class Loaders:
- **Bootstrap ClassLoader** – Loads core Java classes (`java.lang.*`)
- **Extension ClassLoader** – Loads JDK extensions from `lib/ext`
- **Application ClassLoader** – Loads classes from the application classpath

#### Phases:
- **Loading**
- **Linking** (Verification, Preparation, Resolution)
- **Initialization**

---

### 2. Runtime Data Areas

#### ➤ Method Area
- Stores class-level structures like metadata, static variables, and constant pool.
- Shared among all threads.

#### ➤ Heap
- Stores all Java objects and class instances.
- Shared among all threads.
- Managed by the Garbage Collector.

#### ➤ Java Stack
- Each thread has its own stack.
- Contains stack frames for method calls, storing local variables and partial results.

#### ➤ PC Register
- Each thread has its own Program Counter register.
- Contains the address of the JVM instruction currently being executed.

#### ➤ Native Method Stack
- Contains all native method calls used in the application.

---

### 3. Execution Engine

Executes the bytecode loaded into memory.

#### ➤ Interpreter
- Executes bytecode line by line.
- Slower, but starts execution quickly.

#### ➤ JIT Compiler (Just-In-Time)
- Converts bytecode into native machine code for better performance.
- Compiles hot code paths during runtime.

#### ➤ Garbage Collector
- Reclaims memory from objects that are no longer in use.
- Types: Serial, Parallel, CMS, G1, ZGC, Shenandoah

---

### 4. Native Interface (JNI)

- Java Native Interface allows Java code to interact with native applications written in languages like C or C++.

---

### 5. Native Method Libraries

- Platform-specific libraries required for native code execution.

---

## 🔁 JVM Lifecycle

```
Source Code (.java)
        ↓
Compiler (javac)
        ↓
Bytecode (.class)
        ↓
Class Loader
        ↓
Bytecode Verifier
        ↓
Runtime Data Areas (Heap, Stack, etc.)
        ↓
Execution Engine (Interpreter + JIT)
        ↓
Native System
```

---

## 🧠 Memory Management in JVM

- **Young Generation (New Gen)** – for short-lived objects.
- **Old Generation (Tenured)** – for long-lived objects.
- **Permanent Generation (Pre-Java 8)** – for metadata.
- **Metaspace (Java 8 and above)** – replaces PermGen, grows dynamically.

---

## 🔧 JVM Tuning Parameters

- `-Xms` → Initial heap size
- `-Xmx` → Maximum heap size
- `-XX:+UseG1GC` → Use G1 Garbage Collector
- `-XX:+PrintGCDetails` → Print detailed GC logs
- `-XX:MaxMetaspaceSize` → Limit Metaspace size

---

## ✅ Summary

JVM plays a critical role in Java's platform independence, performance, and memory management. It's a complex system that offers fine-tuned control for developers building scalable and high-performance Java applications.




# 🔍 Java Class Loader – In Depth

## 🧱 What is a Class Loader?

The **Class Loader** is a part of the JVM responsible for **dynamically loading classes** into memory at runtime. Java uses lazy loading – classes are loaded only when required.

---

## 🔄 Types of Class Loaders in JVM

| ClassLoader | Description | Loads From |
|-------------|-------------|------------|
| **Bootstrap ClassLoader** | Core of JVM, written in native code | `<JAVA_HOME>/lib` (e.g., `rt.jar`) |
| **Extension ClassLoader** | Loads JDK extensions | `<JAVA_HOME>/lib/ext` |
| **Application ClassLoader** | Loads application-level classes | Classpath (`-cp` or `CLASSPATH`) |
| **Custom/User-Defined** | Created by developers to override loading | Custom sources (JARs, DB, network, etc.) |

> 🔁 **Delegation Model**: Each loader delegates the class loading request to its parent. Only if the parent can’t load it, the current loader tries.

---

## 🔄 Class Loading Phases

Java class loading goes through the following **five phases**:

---

### 1. 📥 Loading
- Loads the `.class` bytecode file from disk/network into JVM memory.
- A `Class` object is created in the **Method Area**.
- This step doesn’t execute any code.

📌 Example:
```java
Class.forName("com.example.MyClass");
```

---

### 2. 🔗 Linking

Prepares the loaded class for execution. It includes:

#### a. ✅ Verification
- Verifies if the bytecode is valid and secure.
- Ensures:
  - No stack overflows
  - Valid class structure
  - No invalid memory access
- Protects against malicious code.

#### b. 📦 Preparation
- Allocates memory for **static fields** and assigns default values (e.g., `0`, `null`, `false`).

#### c. 📍 Resolution
- Converts **symbolic references** (e.g., class/interface/field/method names) into actual memory references.
- Often done **lazily** at runtime.

---

### 3. ⚙️ Initialization
- Static fields are assigned their defined values.
- Executes all `static {}` blocks.
- Happens from **parent to child** in class hierarchy.

---

### 4. 🚀 Using
- The class is now ready to be used: objects created, methods invoked.

---

### 5. 🧹 Unloading
- Happens when class is no longer used and its **ClassLoader** is eligible for GC.
- Only happens for classes loaded by **custom class loaders**.

---

## 🧪 Real-World Example

```java
ClassLoader cl = MyClass.class.getClassLoader();
System.out.println(cl);                         // ApplicationClassLoader
System.out.println(cl.getParent());             // ExtensionClassLoader
System.out.println(cl.getParent().getParent()); // null (Bootstrap)
```

---

## 💡 Why It Matters

- Helps in **modular applications** (like plugins)
- Understanding class loading helps avoid:
  - `ClassNotFoundException`
  - `NoClassDefFoundError`
- Essential for:
  - Web servers (Tomcat, Jetty)
  - Frameworks (Spring, Hibernate)
  - Hot code replacement tools

---

## ✅ Summary

| Phase         | Description |
|---------------|-------------|
| Loading       | Loads `.class` file |
| Linking       | Verifies, prepares, resolves class |
| Initialization| Runs static blocks and assigns values |
| Using         | Class is used in program |
| Unloading     | Class removed when no longer used |






Java uses a **Delegation Hierarchy Model** to load classes, where each ClassLoader delegates the request to its parent before attempting to load it itself.

---

## 🔁 1. Bootstrap ClassLoader

### 🔹 Description:
- The **root** class loader, part of the JVM itself.
- Written in **native code** (not Java).
- Loads core Java classes needed to start JVM.

### 🔹 Loads:
- `java.lang.*`, `java.util.*`, `java.io.*`, etc.
- Classes from: `<JAVA_HOME>/lib`

### 🔹 Characteristics:
- Has no parent.
- Not directly accessible in Java (`null` when calling `.getParent()`).

```java
System.out.println(String.class.getClassLoader()); // null

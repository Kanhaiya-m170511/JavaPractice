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

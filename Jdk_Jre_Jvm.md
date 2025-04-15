# JDK vs JRE vs JVM

## 🔸 1. JVM (Java Virtual Machine)

### ➤ **Definition:**
JVM is an abstract machine that enables your computer to run a Java program. It provides a runtime environment to execute Java bytecode.

### ➤ **Responsibilities:**
- Loads `.class` files (compiled bytecode)
- Verifies code
- Executes code (through JIT compilation)
- Manages memory (via Garbage Collection)

### ➤ **Platform-Dependent:**
Although Java is platform-independent, **JVM is platform-dependent** because different OSes require different JVM implementations.

### ➤ **Key Features:**
- Bytecode execution
- Automatic memory management
- Security and sandboxing
- Stack-based execution model

---

## 🔸 2. JRE (Java Runtime Environment)

### ➤ **Definition:**
JRE is a software package that provides the **libraries**, **JVM**, and other components needed to **run** Java applications.  
It **does not include tools for Java development** (like `javac`).

### ➤ **Contains:**
- JVM
- Java class libraries (rt.jar)
- Deployment technologies (Java Web Start, Java Plug-in)

### ➤ **Used By:**
- End users who want to **run** Java applications
- Not suitable for developers

### ➤ **Folder Structure:**
```
JRE/
├── bin/       → Contains java.exe (JVM)
└── lib/       → Core libraries
```

---

## 🔸 3. JDK (Java Development Kit)

### ➤ **Definition:**
JDK is the **complete package** for Java developers. It includes everything in JRE **plus tools for development**.

### ➤ **Contains:**
- JRE (and therefore JVM)
- Development tools:
  - `javac` (Java compiler)
  - `java` (JVM launcher)
  - `javadoc`, `jar`, `jdb`, etc.

### ➤ **Used By:**
- Developers who want to **develop, compile, and debug** Java applications.

### ➤ **Folder Structure:**
```
JDK/
├── bin/        → Contains compiler (javac), runner (java), and other tools
├── lib/
└── jre/        → Includes JVM and core runtime
```

---

## 🔁 Relationship Diagram:

```
JDK = JRE + Development Tools
JRE = JVM + Libraries
```

```
           +------------------+
           |      JDK         |
           |  +------------+  |
           |  |   JRE      |  |   → Includes javac, javadoc, jar, etc.
           |  | +--------+ |  |
           |  | |  JVM   | |  |   → JVM is the runtime
           |  | +--------+ |  |
           |  +------------+  |
           +------------------+
```

---

## 🔍 Summary Table

| Feature       | JVM                        | JRE                           | JDK                             |
|---------------|-----------------------------|--------------------------------|----------------------------------|
| Purpose        | Runs Java bytecode          | Provides environment to run Java apps | Used to develop Java applications |
| Includes       | -                           | JVM + Libraries                | JRE + Dev Tools (`javac`, etc.)  |
| Platform       | Platform-dependent          | Platform-dependent             | Platform-dependent               |
| Tools          | No                          | No                             | Yes                              |
| Suitable for   | Executing Java              | End-users                      | Developers                       |

---

## ✅ Example Use Case:

- **User**: Wants to just run a Java-based game ➝ Install **JRE**
- **Developer**: Writing Java code, compiling it ➝ Install **JDK**
- **System**: Actually running that code ➝ Requires **JVM**


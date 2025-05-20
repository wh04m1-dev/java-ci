//Here’s a full explanation of **Java Packages**, including built-in and user-defined packages, and how to import and use them.
//
//        ---
//
//        ## 🔹 1. **Java Packages Overview**
//
//A **package** in Java is a **namespace** that organizes a set of related **classes and interfaces**.
//Packages help:
//
//        * **Avoid class name conflicts**
//        * **Group related classes**
//        * **Provide access protection**
//        * **Control visibility**
//
//        ### ✅ Types of Packages:
//
//        1. **Built-in packages** (e.g., `java.util`, `java.io`)
//        2. **User-defined packages** (created by developers)
//
//        ---
//
//        ## 🔹 2. **Built-in Packages**
//
//Java provides many **predefined packages** for commonly used functionalities.
//
//### ✅ Examples:
//
//        | Package     | Description                                                                |
//        | ----------- | -------------------------------------------------------------------------- |
//        | `java.lang` | Core classes like `String`, `Math`, `Object`, etc. *(imported by default)* |
//        | `java.util` | Utility classes like `ArrayList`, `HashMap`, `Date`, etc.                  |
//        | `java.io`   | Input and output (file handling)                                           |
//        | `java.net`  | Networking (sockets, URLs, etc.)                                           |
//        | `java.sql`  | Database programming (JDBC)                                                |
//
//        ### 🔸 Example:
//
//        ```java
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Chanthea");
//        System.out.println(names);
//    }
//}
//```
//
//        ---
//
//        ## 🔹 3. **User-defined Packages**
//
//You can create your own package to organize your code better.
//
//### ✅ Steps to create:
//
//        1. **Define package name** at the top using `package` keyword.
//2. **Compile** the class with `-d .` to create folder structure.
//        3. **Use/import** it in other classes.
//
//        ---
//
//        ### 🔸 Step-by-step Example:
//
//        📄 `mypackage/Message.java`
//
//        ```java
//package mypackage;
//
//public class Message {
//    public void sayHello() {
//        System.out.println("Hello from user-defined package!");
//    }
//}
//```
//
//        📄 `Main.java`
//
//        ```java
//import mypackage.Message; // Import user-defined class
//
//public class Main {
//    public static void main(String[] args) {
//        Message msg = new Message();
//        msg.sayHello();
//    }
//}
//```
//
//        ### 🔧 Compile & Run:
//
//        ```bash
//# Compile
//javac -d . mypackage/Message.java
//javac -cp . Main.java
//
//# Run
//java Main
//```
//
//        ---
//
//        ## 🔹 4. **How to import Class and Package**
//
//        ### ✅ Import a single class:
//
//        ```java
//import java.util.Scanner;
//```
//
//        ### ✅ Import all classes in a package:
//
//        ```java
//import java.util.*; // Imports Scanner, ArrayList, etc.
//        ```
//
//        ### ✅ Fully Qualified Name (no import needed):
//
//        ```java
//public class Main {
//    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        System.out.print("Enter name: ");
//        String name = sc.nextLine();
//        System.out.println("Hello " + name);
//    }
//}
//```
//
//        ---
//
//        ## ✅ Summary Table
//
//| Concept                  | Explanation                                  |
//        | ------------------------ | -------------------------------------------- |
//        | **Package**              | Group of related classes/interfaces          |
//        | **Built-in Package**     | Comes with Java SDK (`java.util`, `java.io`) |
//        | **User-defined Package** | Created by developer (`mypackage`)           |
//        | **Import Class**         | `import mypackage.ClassName;`                |
//        | **Import All Classes**   | `import mypackage.*;`                        |
//        | **FQN Access**           | Use full class name without import           |
//
//        ---
//
//Would you like a small Java project structure showing how to use multiple user-defined packages?

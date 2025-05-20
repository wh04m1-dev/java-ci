//Here is a **detailed explanation** of important **Java new features**, especially from Java 8 to Java 17+. These features bring **functional programming, cleaner syntax, and better performance** to Java.
//
//        ---
//
//        ## 🔹 1. **Lambda Expression** (Java 8)
//
//A **Lambda Expression** provides a **shorter syntax** to implement **functional interfaces** (interfaces with only one abstract method).
//
//        ### ✅ Syntax:
//
//        ```java
//        (parameter) -> { body }
//        ```
//
//        ### 🔸 Example:
//
//        ```java
//interface Greeting {
//    void sayHello();
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Greeting greet = () -> System.out.println("Hello from Lambda!");
//        greet.sayHello();
//    }
//}
//```
//
//        ---
//
//        ## 🔹 2. **Method References** (Java 8)
//
//A **method reference** is a **shorthand** for calling a method using `::`.
//
//        ### ✅ Syntax:
//
//        ```java
//ClassName::methodName
//```
//
//        ### 🔸 Example:
//
//        ```java
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        String[] names = {"Zoe", "Adam", "Eve"};
//        Arrays.sort(names, String::compareToIgnoreCase);
//        System.out.println(Arrays.toString(names));
//    }
//}
//```
//
//        ---
//
//        ## 🔹 3. **Functional Interface** (Java 8)
//
//A **functional interface** is an interface with **a single abstract method**.
//
//        ### ✅ Annotated with `@FunctionalInterface`
//
//        ```java
//@FunctionalInterface
//interface MyFunction {
//    int square(int x);
//}
//```
//
//Used with lambda expressions and method references.
//
//---
//
//        ## 🔹 4. **Default Method** (Java 8)
//
//Allows **interface methods** to have a **default implementation**.
//
//        ```java
//interface MyInterface {
//    default void show() {
//        System.out.println("Default implementation");
//    }
//}
//```
//
//This helps maintain **backward compatibility** when updating interfaces.
//
//---
//
//        ## 🔹 5. **Sealed Class and Interface** (Java 15)
//
//        **Sealed classes/interfaces** restrict which other classes or interfaces may **extend or implement** them.
//
//### ✅ Syntax:
//
//        ```java
//public sealed class Shape permits Circle, Square {}
//final class Circle extends Shape {}
//final class Square extends Shape {}
//```
//
//This provides **stronger control over inheritance**.
//
//        ---
//
//        ## 🔹 6. **Record Keyword** (Java 14)
//
//A **record** is a **compact class** used to model immutable data.
//
//### ✅ Syntax:
//
//        ```java
//public record Person(String name, int age) {}
//```
//
//Equivalent to:
//
//        * Private final fields
//* Constructor
//* Getters
//* `toString()`, `equals()`, `hashCode()`
//
//        ### 🔸 Usage:
//
//        ```java
//public class Main {
//    public static void main(String[] args) {
//        Person p = new Person("Chanthea", 21);
//        System.out.println(p.name()); // Chanthea
//    }
//}
//```
//
//        ---
//
//        ## 🔹 7. **Text Blocks** (Java 15)
//
//A **Text Block** simplifies writing **multi-line strings** using `"""`.
//
//### 🔸 Example:
//
//```java
//String html = """
//    <html>
//        <body>Hello</body>
//    </html>
//        """;
//System.out.println(html);
//```
//
//Improves readability for HTML, SQL, JSON, etc.
//
//---
//
//## 🔹 8. **Switch Expression** (Java 14)
//
//The **enhanced switch** can return values and uses arrow syntax (`->`).
//
//### 🔸 Example:
//
//```java
//int day = 3;
//String result = switch (day) {
//    case 1 -> "Monday";
//    case 2 -> "Tuesday";
//    case 3 -> "Wednesday";
//    default -> "Unknown";
//};
//System.out.println(result);  // Wednesday
//```
//
//---
//
//## 🔹 9. **var Keyword** (Java 10)
//
//`var` allows **type inference** at compile time.
//Only usable in **local variables**, **not method return types or parameters**.
//
//### 🔸 Example:
//
//```java
//var message = "Hello";     // inferred as String
//var number = 42;           // inferred as int
//```
//
//Makes code shorter and cleaner but must still be readable.
//
//---
//
//## ✅ Summary Table
//
//| Feature                  | Description                            |
//| ------------------------ | -------------------------------------- |
//| **Lambda Expression**    | Short syntax for functional interfaces |
//| **Method Reference**     | `ClassName::methodName`                |
//| **Functional Interface** | Interface with 1 abstract method       |
//| **Default Method**       | Interface method with body             |
//| **Sealed Class**         | Restrict subclassing                   |
//| **Record Keyword**       | Concise immutable data class           |
//| **Text Blocks**          | Multi-line strings with `"""`          |
//        | **Switch Expression**    | Arrow-style switch with return         |
//        | **var Keyword**          | Type inference for local variables     |
//
//        ---
//
//Would you like a **practice project** using these features (e.g., Java records + lambdas + text blocks), or a **quiz** to test your understanding?

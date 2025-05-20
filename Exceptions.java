//Here is a **complete and detailed explanation** of **Exceptions in Java**, including types, handling mechanisms, and how to create your own exceptions.
//
//        ---
//
//        ## 🔹 1. Exception Overview
//
//        An **exception** is an **unexpected event** that occurs during the **execution** of a program, disrupting the normal flow.
//
//        Java provides a **robust exception-handling mechanism** to deal with runtime errors.
//
//        ### ✅ Exception Hierarchy:
//
//        ```
//        Object
//        └── Throwable
//        ├── Error (not handled)
//        └── Exception
//        ├── Checked Exceptions
//        └── Unchecked Exceptions (RuntimeException)
//        ```
//
//        ---
//
//        ## 🔹 2. Checked and Unchecked Exceptions
//
//        ### ✅ Checked Exceptions:
//
//        * **Checked at compile-time**
//        * Must be **handled with try-catch or throws**
//        * Examples: `IOException`, `SQLException`
//
//        ```java
//import java.io.*;
//
//public class Test {
//    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("file.txt");  // Checked Exception
//    }
//}
//```
//
//        ---
//
//        ### ✅ Unchecked Exceptions:
//
//        * **Checked at runtime**
//        * Extend `RuntimeException`
//        * Examples: `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`
//
//        ```java
//public class Example {
//    public static void main(String[] args) {
//        int x = 10 / 0; // ArithmeticException
//    }
//}
//```
//
//        ---
//
//        ## 🔹 3. Exception Handling
//
//Java uses `try`, `catch`, `finally`, `throw`, and `throws` to handle exceptions.
//
//---
//
//        ## 🔹 4. try…catch Block
//
//### ✅ Syntax:
//
//        ```java
//try {
//        // Code that may throw exception
//        } catch (ExceptionType e) {
//        // Handle exception
//        }
//        ```
//
//        ### 🔸 Example:
//
//        ```java
//public class Main {
//    public static void main(String[] args) {
//        try {
//            int[] nums = {1, 2};
//            System.out.println(nums[5]); // Throws exception
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Index out of bounds!");
//        }
//    }
//}
//```
//
//        ---
//
//        ## 🔹 5. Multi-Catch Clauses
//
//You can catch **multiple exceptions** in one line using `|`.
//
//        ### 🔸 Example:
//
//        ```java
//try {
//String s = null;
//    System.out.println(s.length());
//        } catch (NullPointerException | ArithmeticException e) {
//        System.out.println("Exception occurred: " + e);
//}
//        ```
//
//        ---
//
//        ## 🔹 6. throw and throws
//
//### ✅ `throw`: Used to **manually throw an exception**
//
//        ```java
//throw new ArithmeticException("Division by zero");
//```
//
//        ### ✅ `throws`: Declares that a method may throw an exception
//
//```java
//void readFile() throws IOException {
//    FileReader fr = new FileReader("file.txt");
//}
//```
//
//        ---
//
//        ## 🔹 7. try-with-resources (Java 7+)
//
//Used to automatically **close resources** like files, sockets, etc.
//The class must implement **AutoCloseable**.
//
//        ### 🔸 Example:
//
//        ```java
//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) {
//        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
//            System.out.println(br.readLine());
//        } catch (IOException e) {
//            System.out.println("IO Error");
//        }
//    }
//}
//```
//
//        ---
//
//        ## 🔹 8. User-defined Exception
//
//You can create your own exception by **extending `Exception` or `RuntimeException`**.
//
//        ### 🔸 Example:
//
//        ```java
//class AgeException extends Exception {
//    public AgeException(String message) {
//        super(message);
//    }
//}
//
//public class Main {
//    static void checkAge(int age) throws AgeException {
//        if (age < 18) {
//            throw new AgeException("Not eligible to vote");
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            checkAge(15);
//        } catch (AgeException e) {
//            System.out.println("Exception: " + e.getMessage());
//        }
//    }
//}
//```
//
//        ---
//
//        ## ✅ Summary Table
//
//| Concept                | Description                                      |
//        | ---------------------- | ------------------------------------------------ |
//        | Exception              | Abnormal condition disrupting execution          |
//        | Checked Exception      | Must be handled during compilation               |
//        | Unchecked Exception    | Occurs at runtime                                |
//        | try-catch              | Handle exceptions                                |
//        | Multi-catch            | Handle multiple exceptions in one block          |
//        | `throw`                | Manually throw an exception                      |
//        | `throws`               | Declare exceptions a method might throw          |
//        | try-with-resources     | Auto-close resources                             |
//        | User-defined Exception | Custom exception class using `extends Exception` |
//
//        ---
//
//Would you like **hands-on practice exercises** for these exception concepts or a **quiz** to test your understanding?

//Here’s a full and clear explanation of **Nested Classes** in Java, including:
//
//        1. **Nested Class** (Overview)
//        2. **Local Inner Class**
//        3. **Anonymous Inner Class**
//
//        ---
//
//        ## 🔹 1. **Nested Class (Overview)**
//
//        In Java, a **nested class** is a class that is defined **within another class**. Nested classes are used to **group logically related classes** together and to improve encapsulation.
//
//### 🧩 Types of Nested Classes:
//
//There are **two main types**:
//
//        1. **Static Nested Class**
//        2. **Non-static Nested Class (Inner Class)**
//
//        * **Member Inner Class**
//        * **Local Inner Class**
//        * **Anonymous Inner Class**
//
//        ---
//
//        ## 🔹 2. **Local Inner Class**
//
//A **Local Inner Class** is a **non-static class defined inside a method or a block**. It can **access final or effectively final local variables** of the method.
//
//### ✅ Key Points:
//
//        * Defined inside a **method**, **constructor**, or **block**.
//        * Cannot use access modifiers (like `public`, `private`).
//        * Can access local variables **only if they are final or effectively final**.
//
//        ### 🔸 Example:
//
//        ```java
//public class Outer {
//    void show() {
//        int age = 21; // effectively final
//
//        class LocalInner {
//            void display() {
//                System.out.println("Age: " + age);
//            }
//        }
//
//        LocalInner local = new LocalInner();
//        local.display();
//    }
//
//    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.show();
//    }
//}
//```
//
//        ---
//
//        ## 🔹 3. **Anonymous Inner Class**
//
//An **Anonymous Inner Class** is a **class without a name**, created **for instant use**, usually when:
//
//        * You need to override a method of an **interface or abstract class**.
//        * You want a **short, one-time-use** class.
//
//It is often used in **event handling**, **thread creation**, etc.
//
//### ✅ Key Points:
//
//        * No class name.
//        * Cannot have a constructor.
//        * Must be **instantiated at the time of declaration**.
//
//        ---
//
//        ### 🔸 Example 1: Anonymous Inner Class Using Interface
//
//```java
//interface Greet {
//    void sayHello();
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Greet greet = new Greet() {
//            public void sayHello() {
//                System.out.println("Hello from Anonymous Inner Class");
//            }
//        };
//        greet.sayHello();
//    }
//}
//```
//
//        ---
//
//        ### 🔸 Example 2: Anonymous Inner Class with Thread
//
//```java
//public class Main {
//    public static void main(String[] args) {
//        Thread t = new Thread() {
//            public void run() {
//                System.out.println("Running thread using anonymous class");
//            }
//        };
//        t.start();
//    }
//}
//```
//
//        ---
//
//        ### 🔸 Example 3: Anonymous Inner Class with Abstract Class
//
//```java
//abstract class Animal {
//    abstract void sound();
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal cat = new Animal() {
//            void sound() {
//                System.out.println("Meow!");
//            }
//        };
//        cat.sound();
//    }
//}
//```
//
//        ---
//
//  Summary Table
//
//  |Concept               | Description                                                                                                   |
//  | --------------------- | ------------------------------------------------------------------------------------------------------------- |
//  | Nested Class          | Class inside another class (for grouping logic)                                                               |
//  | Local Inner Class     | Defined inside a method or block                                                                              |
//  | Anonymous Inner Class | No name, defined and instantiated on the spot, often used for short-term use (e.g., interface implementation) |

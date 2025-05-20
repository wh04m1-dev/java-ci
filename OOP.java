//Here is a **detailed explanation** of key **Object-Oriented Programming (OOP)** concepts in **Java** with examples:
//
//        ---
//
//        ## 🔹 1. **Object-Oriented Programming (OOP)**
//
//OOP is a programming paradigm based on **objects and classes**. It helps in **organizing code**, **reusing code**, and **modeling real-world problems**.
//
//        ### ✅ Key Principles:
//
//        1. **Inheritance**
//        2. **Polymorphism**
//        3. **Encapsulation**
//        4. **Abstraction**
//
//        ---
//
//        ## 🔹 2. **Inheritance**
//
//        **Inheritance** allows a class (child/subclass) to **inherit properties and behaviors** from another class (parent/superclass).
//
//        ### ✅ Key Points:
//
//        * Promotes **code reusability**
//        * `extends` keyword is used
//
//### 🔸 Example:
//
//        ```java
//class Animal {
//    void eat() {
//        System.out.println("Eating...");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Barking...");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();   // Inherited from Animal
//        d.bark();  // Own method
//    }
//}
//```
//
//        ---
//
//        ## 🔹 3. **Method Overriding**
//
//When a **subclass defines a method** with the **same name and parameters** as in the parent class, it's called **method overriding**.
//
//        ### ✅ Key Points:
//
//        * Used for **runtime polymorphism**
//        * Allows subclass to **customize behavior**
//
//        ### 🔸 Example:
//
//        ```java
//class Animal {
//    void sound() {
//        System.out.println("Animal makes sound");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal a = new Dog(); // Upcasting
//        a.sound();  // Output: Dog barks
//    }
//}
//```
//
//        ---
//
//        ## 🔹 4. **Super Keyword**
//
//        `super` refers to the **parent class** and is used to:
//
//        * Call parent class **constructor**
//        * Access parent class **method or variable**
//
//        ### 🔸 Example:
//
//        ```java
//class Animal {
//    void sound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//    void sound() {
//        super.sound();  // Call parent method
//        System.out.println("Dog barks");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.sound();
//    }
//}
//```
//
//        ---
//
//        ## 🔹 5. **Encapsulation**
//
//        **Encapsulation** is the process of **hiding internal details** and only exposing the necessary parts using **getters/setters**.
//
//        ### ✅ Key Points:
//
//        * Use `private` for variables
//* Use `public` getters and setters
//* Protects data
//
//### 🔸 Example:
//
//        ```java
//class Student {
//    private String name;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.setName("Chanthea");
//        System.out.println(s.getName());
//    }
//}
//```
//
//        ---
//
//        ## 🔹 6. **Abstraction and Interface**
//
//        ### **Abstraction**:
//
//Hiding internal details and showing **only the essential features**.
//
//        ### ✅ Achieved using:
//
//        * **Abstract class**
//        * **Interface**
//
//        ---
//
//        ### 🔸 Abstract Class Example:
//
//        ```java
//abstract class Shape {
//    abstract void draw();
//}
//
//class Circle extends Shape {
//    void draw() {
//        System.out.println("Drawing Circle");
//    }
//}
//```
//
//        ---
//
//        ### 🔸 Interface Example:
//
//        ```java
//interface Drawable {
//    void draw();
//}
//
//class Circle implements Drawable {
//    public void draw() {
//        System.out.println("Drawing Circle");
//    }
//}
//```
//
//        ---
//
//        ## 🔹 7. **Polymorphism**
//
//        **Polymorphism** means **"many forms"** – the ability of a single function, method, or operator to behave differently based on context.
//
//### ✅ Types:
//
//        * **Compile-time Polymorphism** (Method Overloading)
//        * **Runtime Polymorphism** (Method Overriding)
//
//        ---
//
//        ### 🔸 Method Overloading (Compile-time):
//
//        ```java
//class MathUtils {
//    int add(int a, int b) {
//        return a + b;
//    }
//
//    double add(double a, double b) {
//        return a + b;
//    }
//}
//```
//
//        ---
//
//        ### 🔸 Method Overriding (Runtime):
//
//        ```java
//class Animal {
//    void sound() {
//        System.out.println("Some sound");
//    }
//}
//
//class Cat extends Animal {
//    void sound() {
//        System.out.println("Meow");
//    }
//}
//```
//
//        ---
//
//        ## ✅ Summary Table
//
//| Concept       | Description                                          |
//        | ------------- | ---------------------------------------------------- |
//        | Inheritance   | One class inherits from another (`extends`)          |
//        | Overriding    | Subclass changes behavior of inherited method        |
//        | `super`       | Refers to superclass method or constructor           |
//        | Encapsulation | Hiding data with private fields + getters/setters    |
//        | Abstraction   | Hiding complex logic, showing only the required      |
//        | Interface     | A contract with abstract methods (`implements`)      |
//        | Polymorphism  | One method behaves differently in different contexts |
//
//        ---
//
//Would you like a Java mini-project that uses all these OOP concepts together?

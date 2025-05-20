//Here’s a detailed explanation of each concept you asked for in **Java**:
//
//        ---
//
//        ### 1. **Class and Object**
//
//        #### **Class**:
//
//A **class** is a **blueprint or template** for creating objects. It defines **data members (variables)** and **methods (functions)** that describe the behavior of the object.
//
//**Syntax:**
//
//        ```java
//class Car {
//    String color;
//    int speed;
//
//    void drive() {
//        System.out.println("Driving...");
//    }
//}
//```
//
//        #### **Object**:
//
//An **object** is an instance of a class. It contains **actual values** for the fields defined in the class.
//
//        **Syntax:**
//
//        ```java
//public class Main {
//    public static void main(String[] args) {
//        Car myCar = new Car();  // Object created
//        myCar.color = "Red";
//        myCar.speed = 100;
//        myCar.drive();          // Access method
//    }
//}
//```
//
//        ---
//
//        ### 2. **Class and Data Members**
//
//        #### **Data Members**:
//
//These are the variables defined inside a class. They can be **instance variables** (specific to an object) or **static variables** (shared among all objects).
//
//        ```java
//class Student {
//    String name;   // instance data member
//    int age;       // instance data member
//    static String school = "RUPP"; // static data member
//}
//```
//
//        ---
//
//        ### 3. **Object and Accessing Data Members**
//
//To access **data members**, we use the **object reference** with the dot `.` operator.
//
//```java
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student();  // Create object
//        s1.name = "Chanthea";
//        s1.age = 21;
//
//        System.out.println(s1.name);     // Output: Chanthea
//        System.out.println(s1.age);      // Output: 21
//        System.out.println(Student.school); // Access static member
//    }
//}
//```
//
//        ---
//
//        ### 4. **Constructors**
//
//A **constructor** is a special method that is **called when an object is created**. Its purpose is to **initialize** the object.
//
//        #### Types:
//
//        * **Default Constructor**: No parameters.
//        * **Parameterized Constructor**: Accepts arguments.
//        * **Copy Constructor**: (not built-in like C++, but you can define manually)
//
//        #### Example:
//
//        ```java
//class Student {
//    String name;
//    int age;
//
//    // Default constructor
//    Student() {
//        name = "Unknown";
//        age = 0;
//    }
//
//    // Parameterized constructor
//    Student(String n, int a) {
//        name = n;
//        age = a;
//    }
//
//    void display() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student();            // Calls default
//        Student s2 = new Student("Chanthea", 21);  // Calls parameterized
//
//        s1.display();
//        s2.display();
//    }
//}
//```
//
//        ---
//
//        ### 5. **`this` and `this()`**
//
//        #### `this` keyword:
//
//Refers to the **current object**. It is used when **local variable names and instance variables are the same**.
//
//        ```java
//class Student {
//    String name;
//
//    Student(String name) {
//        this.name = name; // this refers to the instance variable
//    }
//}
//```
//
//        #### `this()` constructor call:
//
//Used to **call another constructor** from the same class. It must be the **first statement** in the constructor.
//
//```java
//class Student {
//    String name;
//    int age;
//
//    Student() {
//        this("Unknown", 0); // Calls parameterized constructor
//    }
//
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    void display() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student(); // Calls default -> calls parameterized
//        Student s2 = new Student("Chanthea", 21);
//
//        s1.display(); // Output: Name: Unknown, Age: 0
//        s2.display(); // Output: Name: Chanthea, Age: 21
//    }
//}
//```
//
//        ---
//
//        ### Summary Table:
//
//        | Concept           | Description                             |
//        | ----------------- | --------------------------------------- |
//        | Class             | Blueprint/template for creating objects |
//        | Object            | Instance of a class                     |
//        | Data Members      | Variables inside a class                |
//        | Accessing Members | Use object reference (e.g., `obj.name`) |
//        | Constructor       | Initializes an object                   |
//        | this              | Refers to current object                |
//        | this()            | Calls another constructor in same class |
//
//        ---
//
//Would you like exercises to practice these concepts?

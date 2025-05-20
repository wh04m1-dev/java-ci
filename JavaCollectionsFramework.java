//Here's a complete explanation of the **Java Collections Framework**, including its structure and important classes like `ArrayList`, `Vector`, `LinkedList`, `HashSet`, `HashMap`, and `ConcurrentHashMap`.
//
//        ---
//
//        ## 🔹 1. **Collections Framework Overview**
//
//The **Java Collections Framework (JCF)** is a set of **interfaces and classes** that provide **data structures and algorithms** to store, retrieve, and manipulate data efficiently.
//
//### ✅ Key Interfaces in JCF:
//
//        * `Collection` (root interface)
//
//        * `List` → Ordered, allows duplicates
//  * `Set` → No duplicates
//* `Map` (separate hierarchy) → Key-value pairs
//
//---
//
//        ## 🔹 2. **List Interface**
//
//        `List` is an **ordered collection** that allows **duplicate elements**. Elements can be **accessed by index**.
//
//        ### 🔸 Common Implementations:
//
//        | Class        | Description                                         |
//        | ------------ | --------------------------------------------------- |
//        | `ArrayList`  | Fast for access, slower for insert/delete in middle |
//        | `Vector`     | Synchronized version of ArrayList                   |
//        | `LinkedList` | Fast for insert/delete, slower for access           |
//
//        ---
//
//        ### 🔹 a) **ArrayList**
//
//        * **Resizable array**
//        * **Not synchronized**
//        * Allows duplicates
//
//```java
//import java.util.ArrayList;
//
//public class Example {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add("Python");
//        list.add("Java");
//        System.out.println(list);  // [Java, Python, Java]
//    }
//}
//```
//
//        ---
//
//        ### 🔹 b) **Vector**
//
//        * Like ArrayList but **thread-safe** (synchronized)
//        * **Slower** due to synchronization
//
//```java
//import java.util.Vector;
//
//public class Example {
//    public static void main(String[] args) {
//        Vector<String> vector = new Vector<>();
//        vector.add("One");
//        vector.add("Two");
//        System.out.println(vector);  // [One, Two]
//    }
//}
//```
//
//        ---
//
//        ### 🔹 c) **LinkedList**
//
//        * Uses **nodes** (doubly linked list)
//        * Good for **insertion/deletion**
//        * Implements **both List and Deque**
//
//        ```java
//import java.util.LinkedList;
//
//public class Example {
//    public static void main(String[] args) {
//        LinkedList<String> ll = new LinkedList<>();
//        ll.add("A");
//        ll.add("B");
//        ll.addFirst("Start");
//        System.out.println(ll);  // [Start, A, B]
//    }
//}
//```
//
//        ---
//
//        ## 🔹 3. **Set Interface**
//
//        `Set` is a **collection that does not allow duplicates**.
//
//        ### 🔹 a) **HashSet**
//
//        * **Unordered**
//        * No duplicates
//* Uses **HashTable** for storage
//
//```java
//import java.util.HashSet;
//
//public class Example {
//    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>();
//        set.add("Apple");
//        set.add("Banana");
//        set.add("Apple"); // Ignored
//        System.out.println(set);  // [Banana, Apple]
//    }
//}
//```
//
//        ---
//
//        ## 🔹 4. **Map Interface**
//
//A **Map** stores **key-value pairs**. Keys must be **unique**, values can be duplicated.
//
//        ### 🔸 Common Implementations:
//
//        | Class               | Description                   |
//        | ------------------- | ----------------------------- |
//        | `HashMap`           | Unordered, not synchronized   |
//        | `ConcurrentHashMap` | Thread-safe, high performance |
//
//        ---
//
//        ### 🔹 a) **HashMap**
//
//        * Allows **one null key**, many null values
//* **Not thread-safe**
//        * Fast, uses hashing
//
//```java
//import java.util.HashMap;
//
//public class Example {
//    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "Java");
//        map.put(2, "Python");
//        map.put(1, "C++"); // Overwrites key 1
//        System.out.println(map);  // {1=C++, 2=Python}
//    }
//}
//```
//
//        ---
//
//        ### 🔹 b) **ConcurrentHashMap**
//
//        * **Thread-safe**, better than Hashtable
//* **No locking entire map**, only segments
//* Does **not allow null keys/values**
//
//        ```java
//import java.util.concurrent.ConcurrentHashMap;
//
//public class Example {
//    public static void main(String[] args) {
//        ConcurrentHashMap<Integer, String> cmap = new ConcurrentHashMap<>();
//        cmap.put(101, "Java");
//        cmap.put(102, "Go");
//        System.out.println(cmap);  // {101=Java, 102=Go}
//    }
//}
//```
//
//        ---
//
//        ## ✅ Summary Table
//
//| Type | Class             | Ordered? | Duplicates? | Thread-safe?    |
//        | ---- | ----------------- | -------- | ----------- | --------------- |
//        | List | ArrayList         | Yes      | Yes         | No              |
//        | List | Vector            | Yes      | Yes         | Yes             |
//        | List | LinkedList        | Yes      | Yes         | No              |
//        | Set  | HashSet           | No       | No          | No              |
//        | Map  | HashMap           | No       | Keys No     | No              |
//        | Map  | ConcurrentHashMap | No       | Keys No     | Yes (High Perf) |
//
//        ---
//
//Would you like exercises or a mini project (like an address book or to-do list) using these collections?

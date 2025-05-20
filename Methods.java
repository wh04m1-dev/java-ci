public class Methods {
    public static void main(String[] args) {

//      Method Structure in Java
//      A method in Java is a block of code that performs a specific task.

//      The general structure of a method looks like this
//      accessModifier returnType methodName(parameterList) {
//      // method body
//      // code to execute
//      //}

//      Example:
//      public int addNumbers(int a, int b) {
//              return a + b;
//}

//        ### Breakdown:
//
//        * `public` → Access Modifier
//* `int` → Return Type
//* `addNumbers` → Method Name
//* `(int a, int b)` → Parameters
//* `{ return a + b; }` → Method Body
//
//---
//
//        ## ✅ 2. Return Type
//
//The **return type** defines what type of value the method will return after execution.
//
//        ### Common Return Types:
//
//        | Return Type | Description              | Example                    |
//        | ----------- | ------------------------ | -------------------------- |
//        | `void`      | No value is returned     | `public void print()`      |
//        | `int`       | Returns an integer       | `public int sum()`         |
//        | `String`    | Returns a string         | `public String getName()`  |
//        | `boolean`   | Returns true or false    | `public boolean isValid()` |
//        | `double`    | Returns a decimal number | `public double average()`  |
//
//        ---
//
//        ## ✅ 3. Access Modifier
//
//Access modifiers define **who can access the method**. Java has four main types:
//
//        | Modifier    | Access Level                                     |
//        | ----------- | ------------------------------------------------ |
//        | `public`    | Accessible from any class                        |
//        | `private`   | Accessible only within the same class            |
//        | `protected` | Accessible within the same package or subclasses |
//        | (default)   | Accessible within the same package               |
//
//        ### Example:
//
//        ```java
//private void showMessage() {
//    System.out.println("Hello");
//}
//```
//
//        ---
//
//        ## ✅ 4. Parameter
//
//Parameters are **inputs passed to methods**. You can define one or more parameters in a method.
//
//        ### Syntax:
//
//        ```java
//public void greet(String name) {
//    System.out.println("Hello " + name);
//}
//```
//
//        * **Parameter Type**: `String`
//        * **Parameter Name**: `name`
//
//        ### Multiple Parameters:
//
//        ```java
//public int multiply(int a, int b) {
//    return a * b;
//}
//```
//
//        ---
//
//        ## ✅ 5. Standard Library Methods
//
//Java comes with a rich set of **predefined methods** provided in standard libraries like `java.lang`, `java.util`, `java.io`, etc.
//
//### Common Examples:
//
//        | Method                  | Library            | Usage Example |
//        | ----------------------- | ------------------ | ------------- |
//        | `Math.sqrt(25)`         | `java.lang.Math`   | Returns 5.0   |
//        | `System.out.println()`  | `java.lang`        | Prints text   |
//        | `"hello".toUpperCase()` | `java.lang.String` | HELLO         |
//        | `Arrays.sort(array)`    | `java.util.Arrays` | Sorts array   |
//
//You can **reuse** these methods without writing your own implementation.
//
//---
//
//        ## ✅ 6. Advantages of Java Methods
//
//| Advantage              | Explanation                                      |
//        | ---------------------- | ------------------------------------------------ |
//        | ✅ **Code Reusability** | Write once, call many times.                     |
//        | ✅ **Modularity**       | Break large problems into smaller chunks.        |
//        | ✅ **Maintainability**  | Easier to update and fix specific parts of code. |
//        | ✅ **Readability**      | Organized and meaningful code structure.         |
//        | ✅ **Testing**          | Easier to write unit tests for specific methods. |
//        | ✅ **Abstraction**      | Hide implementation details from users.          |
//
//        ---
//
//        ## ✅ Summary Table
//
//| Concept              | Description                                |
//        | -------------------- | ------------------------------------------ |
//        | **Method Structure** | Syntax and components of a method          |
//        | **Return Type**      | Data type returned by the method           |
//        | **Access Modifier**  | Controls visibility of the method          |
//        | **Parameter**        | Inputs accepted by the method              |
//        | **Standard Library** | Predefined, ready-to-use methods           |
//        | **Advantages**       | Benefits like reusability, maintainability |

    }
}
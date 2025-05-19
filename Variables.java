/*
 Variables in Java
     A variable is a container used to store data. It must be declared with a data type.
     Syntax: dataType variableName = value;
     Example:
         int age = 20;
         String name = "John";

     There are three types of variables:
       Local Variable: Declared inside methods.
       Instance Variable: Declared inside a class but outside methods.
       Static Variable: Declared with static, shared among all instances.

 Data Types in Java
     Java is a statically typed language, meaning every variable must have a type.

     Two Categories:
       Primitive	int, char, float, boolean, etc.
       Non-Primitive	String, Array, Class, Object

 Primitive Data Types:
 int	4 bytes	int x = 10;
 float	4 bytes	float pi = 3.14f;
 double	8 bytes	double d = 5.99;
 char	2 bytes	char c = 'A';
 boolean	1 bit	boolean isTrue = true;

 Operators in Java
     Operators perform operations on variables and values.

     Types of Operators:
         Arithmetic	+, -, *, /, %
         Assignment	=, +=, -=, *=, /=
         Relational	==, !=, >, <, >=, <=
         Logical	&&, `
         Unary	+, -, ++, --, !
         Bitwise	&, `

 Example:
 int a = 10, b = 5;
 System.out.println(a + b);  // Output: 15
 System.out.println(a > b);  // Output: true

 Expressions and Blocks
 An expression is a combination of variables, operators, and values that evaluates to a single result.
 int result = a + b * 2;
 A block is a group of statements enclosed in {}.
 {
     int x = 5;
     System.out.println(x);
 }
*/

public class Variables {
    public static void main(String[] args) {
        // Single-line comment
        int age = 25;
        float salary = 4500.50f;
        boolean isEmployed = true;

        /* Arithmetic operation */
        int bonus = 500;
        int total = (int) salary + bonus;

        System.out.println("Total Salary: " + total); // Expression and output

        // Block example
        {
            String name = "Alice";
            System.out.println("Name: " + name);
        }
    }

    // This is a single-line comment

    /* This is a
   multi-line comment */

    /**
     * This is a documentation comment.
     * Used to generate JavaDocs.
     */

}

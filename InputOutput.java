/*
  Java Output with println(), print() and printf()
System.out.println()
Prints the text and moves the cursor to the next line.
System.out.println("Hello World!");
System.out.print()
Prints the text but does not move the cursor to the next line.
System.out.print("Hello ");
System.out.print("World!");
System.out.printf()
Prints formatted text (like in C/C++).
int age = 20;
System.out.printf("I am %d years old.\n", age);
  Concatenated String
You can join strings using the + operator.
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
System.out.println("Full Name: " + fullName);
You can also concatenate other data types:
int age = 25;
System.out.println("Age: " + age);  // Converts int to String automatically
  Java Input with Scanner Class
  To read user input, you use the Scanner class from java.util.
  Import Scanner: import java.util.Scanner;
*/

import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object

        // String input
        System.out.print("Enter your name: ");
        String name = input.nextLine();  // Reads a whole line

        // Integer input
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Double input
        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}


public class ControlFlow {
}

/*
  if…else Statement
  Used to execute code based on a condition.
  Syntax:
  if (condition) {
        // code to execute if condition is true
  } else {
        // code to execute if condition is false
  }
Example:
int number = 10;
if (number > 0) {
        System.out.println("Positive number");
} else {
        System.out.println("Non-positive number");
}
  switch-case Statement
  Used to select one of many code blocks to be executed.
  Syntax:
  switch (variable) {
        case value1:
        // code block
        break;
        case value2:
        // code block
        break;
default:
        // default code block
        }
Example:
int day = 3;
switch (day) {
  case 1:
        System.out.println("Monday");
        break;
                case 2:
                System.out.println("Tuesday");
        break;
                case 3:
                System.out.println("Wednesday");
        break;
default:
        System.out.println("Another day");
}
  Loops
      for loop
Executes a block of code a known number of times.
Syntax:
for (int i = 0; i < 5; i++) {
        System.out.println(i);
}
      for-each loop (used with arrays/collections)
Syntax:
for (String item : items) {
        System.out.println(item);
}
Example:
String[] names = {"Alice", "Bob", "Charlie"};
for (String name : names) {
        System.out.println(name);
}
      while loop
Executes a block of code while a condition is true.
Syntax:
int i = 0;
while (i < 5) {
        System.out.println(i);
i++;
        }
      do-while loop
Executes a block of code at least once, and then repeatedly as long as a condition is true.
Syntax:
int i = 0;
do {
        System.out.println(i);
i++;
        } while (i < 5);
      break and continue Keywords
break: Exits the loop or switch block immediately.
Example:
for (int i = 0; i < 10; i++) {
        if (i == 5) {
        break;
        }
        System.out.println(i);  // prints 0 to 4
}
  continue: Skips the current iteration and continues with the next one.
Example:
for (int i = 0; i < 5; i++) {
        if (i == 2) {
        continue;
        }
        System.out.println(i);  // prints 0, 1, 3, 4 (skips 2)
}
*/


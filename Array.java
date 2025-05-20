import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

//        What is an Array in Java?
//        An Array in Java is a container object that holds a fixed number of elements of a single data type.
//        Java arrays are objects, even when storing primitive types like int, char, or boolean.

//        Array Syntax Overview
//        Task	        Syntax
//        Declare	    int[] arr; or int arr[];
//        Create	    arr = new int[5];
//        Initialize	arr[0] = 10; or int[] arr = {10, 20, 30};
//        Access	    arr[2]

//        One-Dimensional Array (1D Array)
//        A linear structure where data is stored in contiguous memory locations.
        //Example
//        int[] scores = new int[5];   // stores 5 integers
//        scores[0] = 95;
//        scores[1] = 85;
        //Accessing
        //System.out.println(scores[0]); // Output: 95
        //System.out.println(scores[1]);  // Output: 85
        //System.out.println(scores[2]);  // Output: 0
        //System.out.println(scores.length); // Output: 5

        // Iteration
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println("Score " + i + ": " + scores[i]);
//        }

        // Enhanced for-loop
//        for (int score : scores) {
//            System.out.println(score);
//        }

//        Multi-Dimensional Array (2D, 3D, etc.)
//        A table-like structure that stores elements in rows and columns.
        // 2D Array:
        int[][] matrix = new int[3][3]; // 3 rows, 3 columns
        matrix[0][0] = 1;
        matrix[2][2] = 9;
        //With Values:
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //Traversal
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

//        Jagged Arrays (Ragged Arrays)
//        A 2D array where each row has a different number of columns.
//        int[][] jagged = new int[3][];
//        jagged[0] = new int[2];  // row 0 has 2 columns
//        jagged[1] = new int[4];  // row 1 has 4 columns
//        jagged[2] = new int[1];  // row 2 has 1 column

//        Memory Management of Arrays in Java
//🔹     How Arrays are Stored in Java
//       Stack Memory: Holds the reference to the array.
//        Heap Memory: Actual array objects and their values are stored here.
//        Array index starts from 0.
//        Array length is final (cannot be changed).

//        Array Class Utility (java.util.Arrays)
//        Java provides the Arrays class to work efficiently with arrays.
        //import java.util.Arrays;

        int[] arr = {5, 1, 9, 3};

        Arrays.sort(arr); // sorts ascending
        System.out.println(Arrays.toString(arr)); // [1, 3, 5, 9]

        int index = Arrays.binarySearch(arr, 5); // search
        System.out.println("Index: " + index);


//        Common Array Operations
//        Operation	Example	Notes
//        Create Array	int[] arr = new int[5];	Fixed size
//        Insert	arr[0] = 10;	Use index
//        Access	arr[1]	Index-based
//        Traverse	for / for-each	Iteration
//        Sort	Arrays.sort(arr);	Built-in
//        Search	Arrays.binarySearch(arr, 30);	Must be sorted
//        Copy	Arrays.copyOf(arr, 10);	Resize by copying

//        Performance and Limitations
//        Performance
//        Operation	Time Complexity
//        Access	O(1)
//        Update	O(1)
//        Search	O(n) or O(log n) if sorted
//        Insert/Delete	Not supported (fixed size)

//        Limitations
//        Fixed size after creation.
//        Not type-generic (no heterogenous types).
//        No built-in methods for adding/removing.
//        Not memory efficient for large unused space.

//        Best Practices for Using Arrays
//        Use enhanced for-loops where possible.
//        Prefer ArrayList for dynamic size and flexibility.
//        Initialize with default values if needed.
//        Avoid out-of-bounds access: always check .length.
//        Use System.arraycopy() for high-speed copying.

//        Differences: Array vs ArrayList
//        Feature	Array	ArrayList
//        Size	Fixed	Dynamic
//        Type	Primitive/Objects	Objects only
//        Performance	Faster (primitive)	Slower
//        Built-in methods	Few (Arrays)	Many
//        Import required?	No	Yes (java.util.*)

//        Real World Use Cases
//        Student score systems
//        Matrix for scientific computation
//        Game board (e.g., chess or tic-tac-toe)
//        Data tables in reports
//        Buffer storage in I/O processing

//        Advanced Array Tips

//        Copying Arrays
//        int[] a = {1, 2, 3};
//        int[] b = Arrays.copyOf(a, 5); // [1, 2, 3, 0, 0]

//        Cloning:
//        int[] c = a.clone(); // deep copy

//        Comparing Arrays:
//        int[] x = {1, 2};
//        int[] y = {1, 2};

//        System.out.println(Arrays.equals(x, y)); // true

    }
}
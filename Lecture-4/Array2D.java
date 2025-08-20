
/* Topic: 2D Arrays in Java
 * Author: Mubarak Ansari
 * Date: 20-Aug-2025
 * */

// 1. We can create a 2D array using the syntax - int[][] a or int a[][];
// 2. Memory allocation is done using the new keyword - a = new int[3][4]; // 3 rows and 4 columns
// 3. We can also declare and initialize in one line - int[][] a = new int[3][4];
// 4. We can also declare and initialize in one line with values - int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

// Some Important Points:
// Indexing starts from 0, so for a 2D array with 3 rows and 4 columns, the valid indices are:
// Rows: 0, 1, 2    
// Columns: 0, 1, 2, 3
// when we write A[2] - it refers to the 3rd row of the 2D array.
// And A[2][3] - it refers to the 4th element of the 3rd row of the 2D array.

//✨✅ Let's see an example of a 2D array:
// Suppose we have a building with 3 floors and each floor has 4 rooms.
// And each floor has rooms numbered from 0 to 3.
// You are gonna take Lift, so first you will select the floor and then the room number.
// So when you select the 2nd floor in botton- Lift stops at 2nd floor and then you select the room number 3, so it will take you to the room number 3 of the 2nd floor.😊

// So A[2][3] - [2] represents row 2 (3rd floor),,, and [3] represents column 3 (room number 4 on that floor).

/* How To Access
 * To access the elements of a 2D array, we use two indices: one for the row and one for the column.
 * For example, to access the element in the 2nd row and 3rd column
 * we would use A[1][2] (remember, indexing starts from 0).
 * We can traverse a 2D array using nested loops, where the outer loop iterates through the rows and the inner loop iterates through the columns.

 * Example of 2D array traversal:
 * --java
 * for (int i = 0; i < a.length; i++) { // Loop through rows
 *     for (int j = 0; j < a[i].length; j++)    // Loop through columns
 *         System.out.print(a[i][j] + " "); // Accessing element at row i and column j
 *     System.out.println(); // New line after each row 
 */
// code-
public class Array2D {
    public static void main(String[] args) {
        // Declaration and initialization of 2D array
        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Traversing the 2D array using nested for loops
        
        for (int i = 0; i < a.length; i++) { // Loop through rows
            for (int j = 0; j < a[i].length; j++) { // Loop through columns
                System.out.print(a[i][j] + " "); // Accessing element at row i and column j
            }
            System.out.println(); // New line after each row
        }
    }
}
 

// 🌱🌧️🕊️
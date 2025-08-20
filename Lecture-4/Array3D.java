

//  3D-Array ->
// 1. We can create a 3D array using the syntax - int[][][] a or int a[][][];
// 2. Memory allocation is done using the new keyword - a = new int[2][3][4]; // 2 blocks, 3 rows, and 4 columns
// 3. We can also declare and initialize in one line - int[][][] a = new int[2][3][4];
// 4. We can also declare and initialize in one line with values - int[][][] a = {{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}, {{13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24}}};       
// Some Important Points:
// Indexing starts from 0, so for a 3D array with 2 blocks, 3 rows, and 4 columns, the valid indices are:
// Blocks: 0, 1     
// Rows: 0, 1, 2
// Columns: 0, 1, 2, 3  
// when we write A[1] - it refers to the 2nd block of the 3D array.
// And A[1][2][3] - it refers to the 4th element of the 3rd row of the 2nd block of the 3D array.   
//✨✅ Let's see an example of a 3D array:
// Suppose we have a 3D structure like a cube with 2 layers, each layer having 3 rows and 4 columns.
// You can think of it as a stack of 2 boxes, where each box has 3 rows and 4 columns.  
// So A[1][2][3] - [1] represents the 2nd box (layer), [2] represents the 3rd row, and [3] represents the 4th column in that row.   
// How To Access
// To access the elements of a 3D array, we use three indices: one for the block, one for the row, and one for the column.
// For example, to access the element in the 2nd block, 3rd row, and 4th column
// we would use A[1][2][3] (remember, indexing starts from 0).
// We can traverse a 3D array using nested loops, where the outer loop iterates through the blocks, the middle loop iterates through the rows, and the inner loop iterates through the columns.     
// Example of 3D array traversal:
// --java   
// for (int i = 0; i < a.length; i++) { // Loop through blocks
//     for (int j = 0; j < a[i].length; j++) { // Loop through rows
//         for (int k = 0; k < a[i][j].length; k++) { // Loop through columns
//             System.out.print(a[i][j][k] + " "); // Accessing element at block i, row j, and column k
//         }    

/*
 * ✨ 2D-Array is a collection of 1D arrays, where each 1D array represents a row.
 * 3D-Array is a collection of 2D arrays, where each 2D array represents a block.
 * 3D-Array can be visualized as a cube, where each layer is a 2D array.
 */


public class Array3D {
    public static void main(String[] args) {
        // Declaration and initialization of 3D array
        int[][][] a = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        // Traversing the 3D array using nested for loops
        
        for (int i = 0; i < a.length; i++) { // Loop through first dimension
            for (int j = 0; j < a[i].length; j++) { // Loop through second dimension
                for (int k = 0; k < a[i][j].length; k++) { // Loop through third dimension
                    System.out.print(a[i][j][k] + " "); // Accessing element at indices i, j, k
                }
                System.out.println(); // New line after each row in the second dimension
            }
            System.out.println(); // New line after each block in the first dimension
        }
    }
}

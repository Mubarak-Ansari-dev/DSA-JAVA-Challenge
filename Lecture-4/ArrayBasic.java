

// Array is collection of similar types of data elements

// 1D-Array -> 
// Here we create array dynamically with the help of "new" keyword 
// 1. we declare an array like - int a[];
// 2. Runtime memory allocation is done with the help of new keyword-> a = new int[10];
// Now initialization- int a[] = new int[10]; (from 1 & 2) Now memory block is created of size 10
// 3. We can also declare and initialize in one line - int a[] = new int[10];
// 4. We can also declare and initialize in one line with values - int a[] = {1,2,3,4,5,6,7,8,9,10};✅
// here Default values of array elements are 0 for int

//  Now to access the elements of array we use index starting from 0 to size-1

//✨ ArrayList is a dynamic array which can grow and shrink in size.
//✨ Array is a fixed size data structure, once created it cannot be resized.

// Now how to access/traverse the elements of array -> Use loop
// ✅ → Travering can be done using for loop, for each loop, while loop, do while loop
// We can traverse array using for loop by two ways -

// 1. Using index - for(int i=0; i<a.length; i++)
// 2. Using  enhanced for loop - for(int i : a) { System.out.println(i); }
    //   but remember- enhanced for loop is only for traversing(from 0 to size-1), we cannot modify the elements of array using enhanced for loop- 

   
// Example of 1D array
public class ArrayBasic {
    public static void main(String[] args) {
        // Declaration and initialization of array
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Traversing the array using for loop with index
        // System.out.println("Traversing using for loop with index:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Traversing the array using enhanced for loop
        // System.out.println("Traversing using enhanced for loop:");
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}

// Home-Work:->>
   /*Leetcode Problem:
    1.Remove Duplicates from Sorted Array
    2.Search Insert Position/Search element in Sorted Array
    3.Merge Sorted Array
    4.Plus One(66) etc...
    Problem Solved- Power of Two
                    Poer of Four
                    Find the K-th Character in String Game 1
    * 
    */
                         // ++++Some Points++++
    // 🌱 Non-decreasing order means that the array is sorted in ascending order, allowing for duplicates.
    //  →For example, the array [1, 1, 2, 3, 3] is in non-decreasing order because it does not decrease at any point.
    // 🌱 Non-increasing order means that the array is sorted in descending order, allowing for duplicates.
    //  →For example, the array [3, 3, 2, 1, 1] is in non-increasing order because it does not increase at any point.
    // 🌱 An array can be both non-increasing and non-decreasing if it contains the same element repeated multiple times.
    //  → Non-increasing & Non-decreasing order- [2, 2, 2, 2, 2] is in non-increasing & non-decreasing order because it remains constant.



    //  Jazakallh khair for reading the code.
    
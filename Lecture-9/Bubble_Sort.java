
// Bubble sort- we compare consecutive two elements and swap them if they are not in order(increasing or decreasing)
//  live class- example- 2,8,3,5,9,12,11
   /*
    * 1st compare 2,8 - in order  -> no need to swap
    * 2nd compare 8,3 - not in order -> swap -> 2,3,8,5,9,12,11
    * 3rd compare 8,5 - not in order -> swap -> 2,3,5,8,9,12,11
    * 4th compare 8,9 - in order -> no need to swap -> 2,3,5,8,9,12,11
    * 5th compare 9,12 - in order -> no need to swap -> 2,3,5,8,9,12,11
    * 6th compare 12,11 - not in order -> swap -> 2,3,5,8,9,11,12

    * 1st iteration completed -> largest element is at last index
    */
         /* in 1st iteration largest element placed correctly at last index
            * now we will do same for remaining elements except last one    
            * 2nd iteration- but for this example all elements are in correct position
            * but for other examples we will do same as above😊- jab tak sabhi elements apne correct position pe na aa jye
            * so, we will do n-1 iterations for n elements
            */
            // Time complexity- O(n^2) - worst case- when array is in reverse order
            // best case- when array is already sorted- O(n) - optimized version of bubble sort
            // space complexity- O(1) - in place sorting algorithm
    
//Code-
import java.util.*;
public class Bubble_Sort {

    public static void bubbleSort(int[] a){
        int n = a.length;
        //outer loop- for n-1 iterations
        for(int i = n-1; i >= 0; i--){ 
            for(int j=0; j < i; j++){
                if(a[j] > a[j+1]){
                    //swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;  
                }
            }
        }
    }

    // fuction to perform bubble sort- iterate on array n-1 times
    public static void printArray(int[] arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] numbers = {65, 34, 25, 12, 23, 9, 99};

        System.out.println("original array:");
        printArray(numbers); //print original array

        bubbleSort(numbers); //call the function

        System.out.println("Sorted array");
        printArray(numbers); //print sorted array
    }
}
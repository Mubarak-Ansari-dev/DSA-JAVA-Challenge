

public class FibonacciNumber {
    public static int fibonacci(int n) {
        // Base case: if n is 0 or 1, return n
        if (n == 0 || n == 1) {
            return n;
        }
        // Recursive case: return the sum of the two preceding Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        //Calculate the 10th Fibonacci number
        int n = 10; 
        System.out.println(fibonacci(n));    // output- 55
        // Uncomment the line below to see the Fibonacci number at position n 
        // System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
                                               //  Fibonacci number at position 10 is: 55
    }
}




// Fibonacci sequence starts with 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
// Execution flow for fibonacci(5):
/*
fibonacci(5) → fibonacci(4) + fibonacci(3)
fibonacci(4) → fibonacci(3) + fibonacci(2)
fibonacci(3) → fibonacci(2) + fibonacci(1)

fibonacci(2) → fibonacci(1) + fibonacci(0)
fibonacci(1) → 1 (Base case)
fibonacci(0) → 0 (Base case)

Then results are combined backwards:
fibonacci(2) → 1 + 0 = 1
fibonacci(3) → 1 + 1 = 2
fibonacci(4) → 2 + 1 = 3
fibonacci(5) → 3 + 2 = 5
// Final result: fibonacci(5) = 5
*/

// Fibonacci sequence is a classic example of recursion, where each number is the sum of the two preceding ones.
// The recursive approach is straightforward but can be inefficient for larger n due to repeated calculations.
/*
Tips for Recursion:
Always define a base case.
Ensure each call moves toward the base case. 
I try to visualize the recursion tree.
I practice with draw the tree structure to understand the flow.
*/
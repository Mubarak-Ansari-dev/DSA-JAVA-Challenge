/*  How Recursion Works (Step-by-Step)
    Let’s take a factorial example: n! = n × (n-1)!  */

public class Factorial {
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        // This prevents infinite recursion
        if (n == 0 || n == 1) { 
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        // Here, the function calls itself with a smaller value of n
        // This breaks the problem down into smaller subproblems until it reaches the base case
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}


// Execution flow for factorial(5):
/*
factorial(5) → 5 * factorial(4)
factorial(4) → 4 * factorial(3)
factorial(3) → 3 * factorial(2)
factorial(2) → 2 * factorial(1)
factorial(1) → 1 (Base case)

Then results are combined backwards:
1 → 2 × 1 → 3 × 2 → 4 × 6 → 5 × 24 = 120

--- Structure of a Recursive Method ---
    → A recursive method in Java generally has two parts:

    Base Case – the stopping condition, to prevent infinite recursion.
    Recursive Case – the part where the method calls itself with a smaller/simpler input.
 */
// What is recursion?
   /*  a programming technique where a function calls itself to solve a problem. It is often used to break down complex problems into simpler subproblems.
       Recursion can be used to solve problems like calculating factorials, Fibonacci numbers, and traversing data structures like trees and graphs.
   */
//   Why need Recursion? jabki loop bhi use kar sakte hain?
   /*  Recursion can lead to cleaner and more readable code, especially for problems that have a natural recursive structure.
       It can also simplify the implementation of algorithms that involve backtracking or divide-and-conquer strategies.
       However, recursion can be less efficient than iteration in some cases due to function call overhead and stack space usage.
   */


/* Recursion Basics in Java 🚀

 Introduction-
Recursion is a programming technique where a method calls itself to solve a problem.  
It breaks a big problem into smaller sub-problems until a base condition is met.

---

 Structure of a Recursive Function
1.  Base Case – The stopping point to prevent infinite recursion.
2.  Recursive Case – The part where the function calls itself.

---

 Example: Factorial Calculation-

public class Factorial {
    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) return 1;

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}

*/


/* Common Mistakes-
Forgetting the base case → Infinite recursion.
Overlapping subproblems → Use memoization/DP.
StackOverflowError for very deep recursion.

Tips-
Always identify base case first.
Trace recursion using a recursion tree.
Optimize when there are overlapping calls. */

// dry run karte rho 
// Home Assignment:
// 1. Write a recursive function to calculate the nth Fibonacci number.
// 2. Implement a recursive function to reverse a string.
// 3. Leetcode Problems:-
                /* 1.(https://leetcode.com/problems/power-of-two/description/)
                   2.(https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/)
                   3.(https://leetcode.com/problems/power-of-four/description/)  */  
import java.util.*;

public class Collections3 {
   public static void main(String args[]){
    // Stack
    Stack<Integer> s = new Stack<>();
       s.push(10);
       s.push(20);
       s.push(30);

       System.out.println(s); // Output: [10, 20, 30]
       System.out.println(s.peek()); // Output: 30 (top element)
       System.out.println("peek = " + s.peek()); // peek = 30

       s.pop();   // Removes the top element (30)
       System.out.println(s);    // Output: [10, 20]

       System.out.println(s.isEmpty());   // Output: false (stack is not empty


   }   
}

// Stack in Java :- Notes

// Stack is a last-in-first-out (LIFO) data structure.
// It allows elements to be added and removed from the top of the stack only.
// Stack is part of the Java Collections Framework and extends Vector class.
// It provides methods like push(), pop(), peek(), and isEmpty() for stack operations.
// why use Stack?
    // Stack is useful for scenarios where you need to keep track of the order of operations, such as in expression evaluation, backtracking algorithms, or undo functionality in applications.
// when to use Stack?
    // Use Stack when you need to manage a collection of elements in a LIFO manner, such as in parsing expressions, implementing function calls, or managing browser history.
// Stack is not synchronized, so it is not thread-safe. If you need a thread-safe stack, consider using `java.util.concurrent.Stack` or synchronizing access to the stack manually.
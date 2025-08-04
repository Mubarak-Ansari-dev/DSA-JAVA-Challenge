import java.util.*;
// Queue in Java
public class Collections4 {
    public static void main(String args[]){

        Queue<Integer> q = new LinkedList<>();
        q.offer(10); // Adds 10 to the queue
        q.offer(20); // Adds 20 to the queue
        q.offer(30); // Adds 30 to the queue

        System.out.println(q);
        // Output: [10, 20, 30]
        // here bina iteration ke queue ke elements print ho gaye aur na hi inhanced for loop ka use hua
        // b'coz queue is a collection and it has toString() method which returns the string representation of the queue
        System.out.println("peek = " + q.peek()); // Retrieves the head of the queue without removing it
        // Output: peek = 10

        q.poll(); // Removes the head of the queue (10)
        System.out.println(q); // Output: [20, 30] first in first out
        // we can't remove random element from queue, it's not array

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(10);
        pq.offer(40);
        pq.offer(30);
        pq.offer(5);
        pq.offer(50);

        System.out.println(pq); // Output: [5, 10, 30, 40, 50] (elements are sorted in natural order)
        // PriorityQueue sorts the elements based on their natural ordering or a custom comparator if provided  

        pq.poll(); // Removes the head of the queue (5)
        System.out.println(pq); // Output: [10, 30, 40, 50] (5 is removed, and the queue is re-ordered)

        // Double-ended queue (Deque)
        // ArrayDeque<Integer> ad = new ArrayDeque<>();

    }
}


// Queue is a first-in-first-out (FIFO) data structure.
// It allows elements to be added at the end and removed from the front.
// Queue is part of the Java Collections Framework and extends the Collection interface.
// It provides methods like offer(), poll(), peek(), and isEmpty() for queue operations.
// Why use Queue?
// Queue is useful for scenarios where you need to manage a collection of elements in the order they were added, such as in task scheduling, breadth-first search algorithms, or handling requests in a server.
// When to use Queue?
// Use Queue when you need to process elements in the order they were added, such as in task scheduling, event handling, or managing resources in a system.

               // methods in Queue:
// 1. poll() - Retrieves and removes the head of the queue, or returns null if the queue is empty.
// 2. peek() - Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty.
// 3. remove() - Retrieves and removes the head of the queue, throwing an exception if the queue is empty.
// 4. offer() - Adds an element to the end of the queue, returning true if successful, or false if the queue is full.
// 5. add() - Adds an element to the end of the queue, throwing an exception if the queue is full.

    // PriorityQueue is a special type of queue that orders its elements based on their natural ordering or a custom comparator.
    // Comparator vs Comparable:
    // - Comparable is used to define the natural ordering of a class, while Comparator is used to define a custom ordering.
    // - Comparable is implemented by the class itself, while Comparator is a separate class that can be used to compare objects of different classes or the same class with a different ordering.

    // max heap vs min heap:
    // - Max heap is a binary tree where the parent node is greater than or equal to    its child nodes, while min heap is a binary tree where the parent node is less than or equal to its child nodes.     
// - In a max heap, the largest element is at the root, while in a min heap, the smallest element is at the root.
// - PriorityQueue in Java is implemented as a min heap by default, but you can use a custom comparator to create a max heap.

    // Note: Queue is not synchronized, so it is not thread-safe. If you need a thread-safe queue, consider using `java.util.concurrent.BlockingQueue` or synchronizing access to the queue manually.
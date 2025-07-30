/* Collections in Java
  toString() Method-
- Converts object into a readable string.
- Automatically called when you print an object.
- Can be overridden to customize how object is displayed.
- Very useful for debugging, logs, and clean output.
*/

// List- A collection that holds an ordered sequence of elements.
   // It allows duplicate elements and maintains the order of insertion.
// 1.ArrayList- A resizable array implementation of the List interface.
   // It provides fast random access and is efficient for adding/removing elements at the end.
// 2.LinkedList- A doubly-linked list implementation of the List interface.
   // It is efficient for adding/removing elements at both ends but slower for random access.
// 3.Stack- A last-in-first-out (LIFO) data structure.
   // It allows adding and removing elements from the top of the stack only.


import java.util.*;

public class Collections {
    public static void main(String[] args) {

        // List
        List<Integer> number = new ArrayList<>();

        // Adding elements to the list
        number.add(5);
        number.add(10);
        number.add(20);

        number.add(2, 15);
        // This adds the element 15 at index 2, shifting the others to the right.
        number.remove(2);
        // This removes the element at index 2, which is now 15 after the previous
        
        // 2nd way- using for loop to print elements
        for(int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i));
        }
        // here output is column wise

        
        // 3rd way- using iterator to print elements
           // an iterator is an object that allows you to traverse through a collection.
           // It provides methods to check if there are more elements and to get the next element.
        Iterator<Integer> it = number.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


        // 1st way to print the list
        System.out.println(number);
        // here output is [5, 10, 20] because toString() method is called on the list

    }
}

// chuki ArrayList dynamically resize hoti hai, so hum har baar Array ki size check kar sakte hain 
// System.out.println("Size of the list: " + number.size());
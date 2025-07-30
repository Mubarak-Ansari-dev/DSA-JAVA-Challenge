
/*difference b/w ArrayList and LinkedList
      ArrayList is backed by a dynamic array, while LinkedList is backed by a doubly-linked list.
      *but in code, no difference is there in how you use them*
      ArrayList provides fast random access, while LinkedList provides fast insertion and deletion at both ends
    //   🔸 List is an interface,
         🔸 LinkedList is the class you're using to implement it.
      
*/
import java.util.List;
import java.util.LinkedList;

public class Collection2 {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> names = new LinkedList<>();
        // or - List<String> names = new LinkedList<>();

        // Adding elements to the linked list
        names.add("Sane");
        names.add("Lalita");
        names.add("Monu");

        // Adding an element at the beginning
        names.addFirst("Zara");
        
        // Adding an element at the end
        names.addLast("Ali");

        // Removing an element from the linked list
        names.remove("Monu");

        // Printing the linked list
        System.out.println(names);
    }
}

// ArrayList - Dynamic array that can grow as needed.
// LinkedList - Run-time allocation of memory, allowing for efficient insertions and deletions.
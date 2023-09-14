package collections;

import java.util.LinkedList;

/* "Collections," "Data Structures," "Java Collections Framework (JCF)."
In Java, both ArrayList and LinkedList are covered under the topic of: Collections Framework
Specifically, they both are implementations of the List interface in the Java Collections Framework.
While they both implement the List interface, they have different underlying data structures and performance characteristics:

ArrayList uses a dynamic array to store elements, which gives it fast random access capabilities. However, inserting
or deleting an element in the middle can be slower because it might require shifting elements.

LinkedList uses a doubly-linked list data structure. This makes it faster for adding and removing from the beginning
or the end. However, it has slower get and set operations, as it requires traversal from the start or end to a specific position.
 */

public class LinkedListDemo {
    public static void main(String[ ] args) {
        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
        c.remove("Green");
        System.out.println(c);
    }
}
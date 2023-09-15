package collections;
/*
 Java, there is a set of interfaces that define different types of collection.
 At the very top of the hierarchy is Iterable. All types of collection implement Iterable, and
 it declares the forEach method. Then, there is the collection interface, which extends Iterable.
 This interface declares all the methods that every collection must have.

 Iterable:
     Collection:
     - Set
     - List
     - Queue: FIFO
     - Stack: LIFO
     - Map: Key-value pairs. Does not extend Collection interface but regarded as part of the collection-framework.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class IterableExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Using an Iterator to iterate over the elements
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println("Element: " + number);
        }
    }
}
/* Using foreach looping over the elements:
            for (Integer number : numbers) {
            System.out.println("Element: " + number);
        }
 */

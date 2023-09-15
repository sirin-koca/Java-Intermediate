package collections;
/*
An Iterator is an object that enables to cycle through a collection, obtain or remove elements.
Before you can access a collection through an iterator, you must obtain one. Each of the collection classes
provides an iterator() method that returns an iterator to the start of the collection. By using this iterator object,
you can access each element in the collection, one element at a time.

The Iterator class provides the following methods:
hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
next(): Returns the next object and advances the iterator.
remove(): Removes the last object that was returned by next from the collection.

The Iterator class must be imported from the java.util package.
 */

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
    public static void main(String[ ] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        Iterator<String> it = animals.iterator();

        for(String v : animals){
            String value = it.next();
            System.out.println(value);
        }
    }
}
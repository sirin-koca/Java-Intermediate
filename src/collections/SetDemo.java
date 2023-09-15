package collections;
/*
A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
One of the implementations of the Set is the HashSet class.
 */

import java.util.HashSet;

public class SetDemo {
    public static void main(String[ ] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}

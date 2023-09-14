package collections;

/*
HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value).
The put, remove, and get methods are used to add, delete, and access values in the HashMap.
 */

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[ ] args) {

        HashMap<String, Integer> points = new HashMap<String, Integer>();

        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);
        System.out.println(points.get("Dave"));
    }
}
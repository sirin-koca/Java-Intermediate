package collections;
/*
## What is HashMap?
A HashMap in Java is a data structure that lets you store and retrieve data in pairs: a unique key paired with
its associated value: a(key, value) pair. Think of it as a real-world dictionary: you look up a word (the key)
to find its definition (the value).

## How does it work?
HashMap uses a technique called hashing. When you put in a key, the HashMap translates this key into a number using
a process called hashing. This number helps the HashMap quickly locate where the value is stored, ensuring fast data retrieval.

## How to use it?

        Initialization:
        HashMap<String, Integer> map = new HashMap<>();

        Adding Data:
        map.put("apple", 1);
        map.put("banana", 2);

        Retrieving Data:
        int value = map.get("apple");  // value will be 1

        Removing Data:
        map.remove("apple");

        Checking Existence:
        boolean hasApple = map.containsKey("apple");

## Important points:
Keys are unique. If you try to put a value with an already existing key, the old value gets replaced.
If you try to get a value with a key that's not in the map, you'll receive null.
A HashMap is like a super-powered list where, instead of using an index to access values, you use unique keys.
This makes data retrieval incredibly fast and efficient.
 */

import java.util.HashMap;
import java.util.Map;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // hashCode() and equals() methods should be overridden for efficient and correct operations in HashMap
    @Override
    public int hashCode() {
        return name.hashCode(); // a simple hash based on the name string
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name);
    }
}


public class HashMapDemo {
    public static void main(String[] args) {

        // Ex1 - Map1:
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "This is number one!");
        System.out.println("Map1: " + map1.get(1));
        System.out.println();

        //Ex2 - Map2:
        HashMap<Person, String> map2 = new HashMap<>();
        map2.put(new Person("John"), "Developer");
        map2.put(new Person("Jane"), "Manager");
        map2.put(new Person("Doe"), "Tester");

        System.out.println("Map2: ");
        for (Map.Entry<Person, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
        System.out.println();

        //Ex3 - Map3:
        HashMap<String, Integer> map3 = new HashMap<>();

        // Adding key-value pairs
        map3.put("John", 28);
        map3.put("Jane", 25);
        map3.put("Jake", 30);
        map3.put("Maya", 5);
        map3.put("Sirin", 45);

        System.out.println("Map3: ");

        // Iterating through HashMap
        for (String key : map3.keySet()) {
            System.out.println(key + ": " + map3.get(key));
        }

        // Accessing values
        System.out.println("John's age: " + map3.get("John")); // Outputs: John's age: 28

        // Removing key-value pairs
        map3.remove("Jake");

        // Check if a key exists
        System.out.println("Does Jake exist? After removing Jake: " + map3.containsKey("Jake")); // Outputs: Does Jake exist? false


        // Loop through hashmap using Lambdas:
        map3.forEach((key, value) -> { System.out.println(key + ": " + value); });

        // Check the size of the map:
        System.out.println(map1.size());
        System.out.println(map2.size());
        System.out.println(map3.size());

    }
}

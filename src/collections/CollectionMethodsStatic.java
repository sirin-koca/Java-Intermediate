package collections;
/*
Sorting Lists
For the manipulation of data in different collection types, the Java API provides a Collections class, which is included in the java.util package.

One of the most popular Collections class methods is sort(), which sorts the elements of your collection type.
The methods in the Collections class are static, so you don't need a Collections object to call them.

Other useful methods in the Collections class:
max(Collection c): Returns the maximum element in c as determined by natural ordering.
min(Collection c): Returns the minimum element in c as determined by natural ordering.
reverse(List list): Reverses the sequence in list.
shuffle(List list): Shuffles (i.e., randomizes) the elements in list.
 */

import java.util.ArrayList;
import java.util.Collections;

public class CollectionMethodsStatic {
    public static void main(String[ ] args) {

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");

        Collections.sort(animals);
        System.out.println(animals);

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(36);
        nums.add(73);
        nums.add(40);
        nums.add(1);

        Collections.sort(nums);
        System.out.println(nums);
    }
}


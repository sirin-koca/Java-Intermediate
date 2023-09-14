package java_features;
import java.util.ArrayList;

/*
ArrayLists are created with an initial size, but when this size is exceeded, the collection is automatically enlarged.
When objects are removed, the ArrayList may shrink in size. ArrayList class is in the java.util package,
so it's necessary to import it before using it.
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("is");
        list.add("awsome");
        System.out.println(list.get(2));  // Prints "awsome"
        System.out.println(list);
    }
}

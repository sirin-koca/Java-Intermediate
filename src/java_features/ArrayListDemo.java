package java_features;
import java.util.ArrayList;

/*
ArrayLists are created with an initial size, but when this size is exceeded, the collection is automatically enlarged.
When objects are removed, the ArrayList may shrink in size. ArrayList class is in the java.util package,
so it's necessary to import it before using it.

ArrayLists store objects. Thus, the type specified must be a class type. You cannot pass, for example, int as
the objects' type. Instead, use the special class types that correspond to the desired value type, such as Integer
for int, Double for double, and so on.

We create an ArrayList as you would any object. The add() method adds new objects to the ArrayList.
Conversely, the remove() method removes objects from the ArrayList.
Ex:
    import java.util.ArrayList;
    //... some code here...
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("Orange");
    colors.remove("Green");
    System.out.println(colors);

Ex:
    ArrayList<String> colors = new ArrayList<String>(10);
    //The code above defines an ArrayList of Strings with 10 as its initial size.

Other useful methods include the following:
- contains(): Returns true if the list contains the specified element
- get(int index): Returns the element at the specified position in the list
- size(): Returns the number of elements in the list
- clear(): Removes all of the elements from the list
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

package generics;
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {

/* 
The program demonstrates how generics enhance type safety by ensuring that collections only contain objects of a specified type. 
By using generics with the List<String> declaration, the compiler will enforce that only strings are added to genericList. 
This prevents runtime errors, such as ClassCastException, which could occur if the program were to attempt to cast an object of 
one type to another incompatible type.

When we run this program the output will be: 
    NoGenerics: Error: Incorrect data type!
    WithGenerics: John
*/

        // Non-generic List
        List nonGenericList = new ArrayList();
        nonGenericList.add("John");
        nonGenericList.add(123);  // This will compile, but is logically incorrect
        String nameWithoutGenerics;
        try {
            nameWithoutGenerics = (String) nonGenericList.get(1);  // Causes runtime error
        } catch (ClassCastException e) {
            nameWithoutGenerics = "Error: Incorrect data type!";
        }
        System.out.println("NoGenerics: " + nameWithoutGenerics);

        // Generic List
        List<String> genericList = new ArrayList<>();
        genericList.add("John");
        // genericList.add(123);  // This line will cause compile-time error
        String nameWithGenerics = genericList.get(0);
        System.out.println("WithGenerics: " + nameWithGenerics);
    }
}

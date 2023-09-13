package generics;
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {

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

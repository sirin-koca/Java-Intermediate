package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {

        // Example without Generics
        List names1 = new ArrayList();
        names1.add("Sirin");
        String name1 = (String)names1.get(0);
        System.out.println("First name in the list: " + name1);

        // Example with Generics, aka generify
        List<String> names2 = new ArrayList<>();
        names2.add("Sirin");
        String name2 = names2.get(0);
        System.out.println("First name in the list: " + name2);

        /*
        Using generics means that the compiler checks that only strings are added to the list which makes the code safer.
         */
    }
}

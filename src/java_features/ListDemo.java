package java_features;
import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("is");
        list.add("awsome");
        System.out.println(list.get(2));  // Prints "awsome"
        System.out.println(list);
    }
}

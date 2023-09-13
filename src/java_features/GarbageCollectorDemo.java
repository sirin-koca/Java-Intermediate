package java_features;

public class GarbageCollectorDemo {
    public static void main(String[] args) {
        String temp = new String("I'm temporary");
        temp = null;  // The string object is now eligible for garbage collection.
        System.out.println(temp);
    }
}

package arrays;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {

        char[] charArray = {'a', 'b', 'c', 'd'};
        String[] stringArray = {"Sirin", "OsloMet", "Dewi", "NTNU", "UIO", "I love dogs"};

        int[] intArray = {2, 4, 6, 8, 10, 100, 1000};
        int intValue = 5;

        double[] doubleArray = {0.1, 9.3, 5.6, 23.5};

        Object[] objectArray = {'a', 'A', 2, "hello", 23.6, -1500};
        Object objectRef = "Hello " + 5;

        // print-out:
        System.out.println(objectRef);
        System.out.println(intValue);

        // String.valueOf()
        System.out.println(String.valueOf(charArray));
        System.out.println(Arrays.toString(charArray));

        // Arrays.toString() method:
        // Java has a toString method that enables a program to obtan the objects string representation.
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(objectArray));

        /* OUTPUT:
        Hello 5
        5
        abcd
        [a, b, c, d]
        [Sirin, OsloMet, Dewi, NTNU, UIO, I love dogs]
        [2, 4, 6, 8, 10, 100, 1000]
        [0.1, 9.3, 5.6, 23.5]
        [a, A, 2, hello, 23.6, -1500]
        * */

    }
}

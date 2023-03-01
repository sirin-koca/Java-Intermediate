package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    static Character[] charArray = {'a', 'b', 'c'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    // Without generics-method
    public static List arrayToList(Object[] array, List<Object> list){
        for(Object object : array){
            list.add(object);
        }
        return list;
    }

    // With generics-method
    public static <T> List<T> arrayToListGeneric(T[] array, List<T> list){
        for (T object : array){
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());

        System.out.println(charList);
        System.out.println(intList);
        System.out.println(boolList);

    }

}

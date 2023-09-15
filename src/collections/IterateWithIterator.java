package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateWithIterator {
    public static void main(String[ ] args) {
        LinkedList<String> munckins = new LinkedList<String>();
        munckins.add("babyfox");
        munckins.add("kittycat");
        munckins.add("puppy");
        munckins.add("babyrabbit");

        // easy iteration with for-loop:
        //        for (String value : munckins) {
        //            System.out.println(value);
        //        }

        Iterator<String> it = munckins.iterator();
        while(it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
    }
}
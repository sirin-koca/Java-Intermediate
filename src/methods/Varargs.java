package methods;
/*
Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments. It is implemented by
using the single dimensions arrays concept. Hence, in the Varargs method, we can differentiate arguments by using Index.
A variable-length argument is specified by three periods or dots(…).

For Example:

public static void func(int ... a)
{
   // method body
}
 */

public class Varargs {
    // A method that takes variable
    // number of integer arguments.
    static void fun(int... a){
        System.out.println("Number of arguments in this method: " + a.length);

        // using for-each-loop to display contents of a
        for (int i : a)
            System.out.print(i + ", ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[]){
        // Now we can the varargs method with
        // different number of parameters

        // one parameter
        fun(10);

        // three parameters
        fun(1, 2, 3);

        // no parameter
        fun();
    }
}

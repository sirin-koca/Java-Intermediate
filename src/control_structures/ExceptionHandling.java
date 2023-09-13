package control_structures;

class Exceptions {
    public static void main(String[] args) {

        // Division by zero raises ArithmeticException:
        int a = 5;
        int b = 0;

/* A single try block can contain multiple catch blocks that handle different exceptions separately.

try {
//some code
} catch (ExceptionType1 e1) {
//Catch block
} catch (ExceptionType2 e2) {
//Catch block
} catch (ExceptionType3 e3) {
//Catch block
}
*/

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

        // Taking an empty string raises NullPointerException:
        String str = null;
        // Getting length of a string
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("It is an empthy string!");
        }

    }
}

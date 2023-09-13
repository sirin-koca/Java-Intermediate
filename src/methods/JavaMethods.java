package methods;

/*
There are two types of methods in Java:
1- Predefined Method (library / built-in methods): Eg. length(), equals(), compareTo(), sqrt(), main(), print(), and max().
2- User-defined Method: The method written by the developer/programmer (examples below).
*/

public class JavaMethods {

    public void method1() {
        String out = "I am method1 and I operate on object1";
        System.out.println(out);
    }

    public static void method2() {
        String out = "I am method2 and I need no object!";
        System.out.println(out);
    }

    public static int method3(int num1, int num2){
        int sum = num1 + num2;
        String out = "I am method3 and I can return the sum of numbers: " + sum;
        System.out.println(out);
        return sum;
    }

    public static void main(String[] args) {

        // call method1:
        JavaMethods object1 = new JavaMethods();
        object1.method1();

        // call method2:
        method2();

        // call method3:
        int num3 = method3(3, 4);

    }
}



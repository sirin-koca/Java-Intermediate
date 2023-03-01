package control_structures;

class Exceptions {
    public static void main(String[] args) {

        // Division by zero raises ArithmeticException:
        int a = 5;
        int b = 0;

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

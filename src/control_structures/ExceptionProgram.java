package control_structures;

//Multiple exceptions can be defined in the throws statement using a comma-separated list.
public class ExceptionProgram {

    static int div(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(42, 0));
    }

}
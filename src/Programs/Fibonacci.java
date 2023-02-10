package Programs;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }

        int pre = 0;
        int prepre = 1;
        int result = 0;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                result = pre + prepre;
                prepre = pre;
                pre = result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.fibonacci(0));
        System.out.println(Fibonacci.fibonacci(1));
        System.out.println(Fibonacci.fibonacci(2));
        System.out.println(Fibonacci.fibonacci(3));
        System.out.println(Fibonacci.fibonacci(4));
        System.out.println(Fibonacci.fibonacci(5));
        System.out.println(Fibonacci.fibonacci(6));
        System.out.println(Fibonacci.fibonacci(7));
        System.out.println(Fibonacci.fibonacci(8));
        System.out.println(Fibonacci.fibonacci(9));
        System.out.println(Fibonacci.fibonacci(10));

    }

}

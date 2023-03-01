package programs;

public class PrimeNumberChecker {
    static void checkPrime(int n) {

        int i, m, redFlag = 0;

        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");

        } else {
            for (i = 2; i <= m; i++) {

                if (n % i == 0) {
                    System.out.println(n + " is not a prime number");
                    redFlag = 1;
                    break;
                }
            }
            if (redFlag == 0) {
                System.out.println(n + " is a prime number");
            }
        }//end of else
    }

    public static void main(String args[]) {
        checkPrime(1);
        checkPrime(3);
        checkPrime(17);
        checkPrime(20);
        checkPrime(24);
        checkPrime(41);
    }
}

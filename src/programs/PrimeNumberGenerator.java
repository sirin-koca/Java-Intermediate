package programs;

public class PrimeNumberGenerator {

    public static void main(String[] args) {
        int n = 150;
        int i = 1;
        while (i <= n) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++; // øk teller
                }
            }
            if (c == 2) {
                System.out.println("" + i);
            }
            i++;
        }
    }
}
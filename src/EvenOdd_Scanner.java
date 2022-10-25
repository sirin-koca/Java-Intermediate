import java.util.Scanner;

// Java.util Scanner-class is a simple text-scanner
// Scanner sc = new Scanner(System.in);  int i = sc.nextInt()

public class EvenOdd_Scanner {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
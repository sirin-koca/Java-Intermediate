package control_structures;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MultiExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Write a number and press enter:");
            int num1 = scanner.nextInt();
            System.out.println(num1);

            System.out.println("Write a number and press enter:");
            int num2 = scanner.nextInt();
            System.out.println(num2);

            double div = (double) num1 / num2;
            System.out.printf("%.2f", div);
            
        } catch(ArithmeticException e1) {
            System.out.println("Error: division by zero");
        } catch(InputMismatchException e2){
            System.out.println("Error: wrong value type");
            scanner.next();  // Clear the invalid token
        }
    }
}

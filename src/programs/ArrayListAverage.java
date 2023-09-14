package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> evennums = new ArrayList<Integer>();

        System.out.println("Enter numbers (type any non-integer to stop):");

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            evennums.add(num);

            int total = 0;  //calculate and output the average integer value
            for (int i = 0; i < evennums.size(); i++) {
                total += evennums.get(i);
            }
            System.out.println("Current average: " + total / evennums.size());
        }
        scanner.close();
    }
}

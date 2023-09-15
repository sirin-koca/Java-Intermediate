package collections;

import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class WriteFileFormatter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("tasks.txt");
            int count = 0;
            while (count < 3) {
                // Your code goes here
                String task = input.nextLine();
                f.format("%s%n", task); // Use "%s%n" to add a newline after each task
                count++;
            }
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        readFile();
    }

    public static void readFile() {
        try {
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNextLine()) { // Use hasNextLine() to read full lines
                System.out.println(sc.nextLine()); // Use nextLine() to read the entire line
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

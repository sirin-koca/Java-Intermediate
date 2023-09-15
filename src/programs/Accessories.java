package programs;

import java.util.Scanner;

public class Accessories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int c = scanner.nextInt();

        String[] cat = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};

        if (c < 10) {
            try {
                System.out.println("The item you choose: " + cat[c]);
            } catch (Exception e) {
                System.out.println("Wrong Option");
            }
        } else {
            System.out.println("Number is too big!");
        }
    }
}
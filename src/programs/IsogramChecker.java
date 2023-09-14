package programs;

import java.util.Scanner;

/*
An isogram is a word that has no repeating letters, whether they are consecutive or non-consecutive.
Write a program that takes in a string as input, detects if the string is an isogram and outputs true or false based on the result.
This program works by comparing each character in the string to every other character in the string.
 */
public class IsogramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        if (isIsogram(word)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean isIsogram(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!Character.isLetter(currentChar)) {
                continue;
            }

            for (int j = i + 1; j < word.length(); j++) {
                if (currentChar == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}

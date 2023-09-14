package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEx1 {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> words = new LinkedList<String>();

        while(words.size()<5){
            System.out.println("Enter a word, press enter: ");
            String word = scanner.nextLine();
            //add the word to LinkedList
            words.add(word);
        }
        // loop throug the list:
        for(String word: words){
            if(word.length() > 4)
                System.out.println("The words which has letters more than four: " + word);
        }
    }
}
package programs;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*
- Take a string input from the user and store it in a variable called "input".
- Create two variables, one named "start" and set it to 0, and another named "end" and set it to the length of the "input" string minus 1.
- Create a loop that continues until "start" is greater than or equal to "end".
- Within the loop, compare the character at the "start" index to the character at the "end" index.
- If the characters are not equal, return false.
- If the characters are equal, increment "start" and decrement "end".
- After the loop, return true, as the input string is a palindrome.
 */

public class PalindromeChecker {

    // Create a method named "isPalindrome"
    public static boolean isPalindrome() {
        String input = showInputDialog("Type a word: ");
        if (input.length() == 0) {
            showMessageDialog(null, "Input cannot be empty");
            return false;
        }
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                showMessageDialog(null, "That is not a palindrome.");
                return false;
            }
            start++;
            end--;
        }
        showMessageDialog(null, "Bingo! That is a palindrome");
        return true;
    }

    public static void main(String[] args) {
        isPalindrome();
    }

}


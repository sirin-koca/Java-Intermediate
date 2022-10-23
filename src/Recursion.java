import static javax.swing.JOptionPane.*;

class Recursive{
    public boolean understandRecursion(String doYouUnderstandRecursion) {

        String recursionAnswer = showInputDialog(null, "Do you understand recursion?\nPlease type: Y/N");
        if(recursionAnswer.equals("Y")) { // base case
            showMessageDialog(null, "Good job!");
            return true;
        }
        if(recursionAnswer.equals("N")) { // base case
            understandRecursion(doYouUnderstandRecursion); // recursive call
        }
        else {
            showMessageDialog(null, "Something went wrong, try again!");
        }
        return false;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Recursive call = new Recursive();
        call.understandRecursion("");
    }
}

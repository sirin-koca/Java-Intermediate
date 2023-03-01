package control_structures;

import static javax.swing.JOptionPane.*;


public class WhileLoop {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        try{
            int getNumber = Integer.parseInt(showInputDialog("Write a number:"));
            while (getNumber > 0){
                sum = sum + getNumber;
                count++;
                getNumber = Integer.parseInt(showInputDialog("Write a new number:"));
            }
            if(getNumber==0){
                showMessageDialog(null, "The sum is: " + sum);
                showMessageDialog(null, "The average:" + sum/count);
            }
        } catch (Exception e){
            showMessageDialog(null, "Something went wrong, please try again!");
        }


    }
}


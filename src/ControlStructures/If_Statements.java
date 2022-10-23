package ControlStructures;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class If_Statements {
    public static void main(String[] args) {
        String ask = showInputDialog("What is your age?");
        int intAsk = Integer.parseInt(ask);

        if(intAsk < 18 ){
            showMessageDialog(null,"You are not old enough!");
        }
        if(intAsk >= 18 && intAsk <= 65){
            showMessageDialog(null, "You are an adult.");
        }
        if(intAsk > 65 ){
            showMessageDialog(null, "Take some vacation and enjoy life! :)");
        }

        String ut = intAsk >= 18 ? "Norwegian: Du er voksen" : "Norwegian: Du er ikke voksen";
        JOptionPane.showMessageDialog(null, ut);
    }
}

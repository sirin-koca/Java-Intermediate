package ControlStructures;

import static javax.swing.JOptionPane.*;

public class Switch {
    public static void main(String[] args) {
        int result = 0;
        int num1 = Integer.parseInt(showInputDialog("Write a number:"));
        String operator = showInputDialog("Please shoose an operator: + , - , * , / ");
        int num2 = Integer.parseInt(showInputDialog("Write a second number:"));

        switch (operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                result = 0;
                break;
        }
        showMessageDialog(null, "Result is: " + num1 + operator + num2 + " = " + result);
    }
}



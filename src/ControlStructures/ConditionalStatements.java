package ControlStructures;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class ConditionalStatements {

    public static void main(String[] args) {
        String innAlder = showInputDialog("Skriv inn alderen din");
        int alder = Integer.parseInt(innAlder);
        if(alder < 13){
            showMessageDialog(null, "Du er jo bare barn");
        }
        if(alder >= 13 && alder < 18){
            showMessageDialog(null, "Du er ungdom");
        }
        if(alder >= 18 && alder < 70){
            showMessageDialog(null, "Du er voksen");
        }
        if(alder >= 70){
            showMessageDialog(null, "Du er pensjonist");
        }

        // alternativ

        if(alder >= 70){
            showMessageDialog(null, "Du er pensjonist");
        }
        else if (alder >= 18){
            showMessageDialog(null, "Du er voksen");
        }
        else if (alder >= 13) {
            showMessageDialog(null, "Du er ungdom");
        }
        else{
            showMessageDialog(null, "Du er bare barnet");
        }

        String innStreng = showInputDialog("Har du førerkort ? (J/N)");
        boolean myndig = false;
        boolean førerkort = false;
        if(innStreng.equals("J")){
            førerkort = true;
        }
        if (alder >=18){
            myndig = true;
        }
        if(myndig && !førerkort){
            showMessageDialog(null, "Selv om du er myndig kan du ikke kjøre bil.");
        }
        // if(myndig == true && førerkort == false)

        /*
        A : 90 - 100
        B : 80 - 90
        C : 60 - 80
        D : 50 - 60
        E : 40 - 50
        F : 0 - 40
        */
        String innPoeng = showInputDialog("Skriv inn antall poeng (0-100)");
        int poeng = Integer.parseInt(innPoeng);
        poeng = poeng / 10;
        switch (poeng){
            case 10:
            case 9:
                showMessageDialog(null,"A");
                break;
            case 8:
                showMessageDialog(null,"B");
                break;
            case 7:
            case 6:
                showMessageDialog(null,"C");
                break;
            case 5:
                showMessageDialog(null,"D");
                break;
            case 4:
                showMessageDialog(null,"E");
                break;
            default:
                showMessageDialog(null, "F");
                break;
        }
        if(poeng > 0 && poeng < 4){
            showMessageDialog(null, "F");
        }
        if(poeng == 4){
            showMessageDialog(null, "E");
        }
        if(poeng == 5){
            showMessageDialog(null, "D");
        }
        if(poeng >= 6 && poeng < 8){
            showMessageDialog(null, "C");
        }
        if(poeng == 8){
            showMessageDialog(null, "B");
        }
        if(poeng >= 9){
            showMessageDialog(null, "A");
        }

    }
}
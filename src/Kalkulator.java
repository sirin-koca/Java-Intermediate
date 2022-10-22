
import javax.swing.*;

import static javax.swing.JOptionPane.*;

/*
* Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver.
* Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall.
Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer. */
class Calculate{
    public static int addere(int a, int b){
        int c = a + b;
        return c;
    }
    public static int subtrahere(int a, int b){
        int c = a - b;
        return c;
    }
    public static int multiplisere(int a, int b){
        int c = a * b;
        return c;
    }
    public static int dividere(int a, int b){
        int c = a / b;
        return c;
    }
    public static int modulo(int a, int b){
        int c = a % b;
        return c;
    }
}
public class Kalkulator {
    public static void main(String[] args) {
        int add= Calculate.addere(4,5);
        int sub= Calculate.subtrahere(4,5);
        int mul= Calculate.multiplisere(4,5);
        int div= Calculate.dividere(4,5);
        int mod= Calculate.modulo(4,5);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);


    }
}

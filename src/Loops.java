import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Loops {

    public static void main(String[] args) {
        int sum = 0;
        int fraTall = 100;
        int tilTall = 1000;

        // ** FOR LOOP ** ////////////////////////////////////////
        for (int i = fraTall; i < tilTall; i++) {
            sum = sum + i;
        }
        System.out.println("Summen av alle tall mellom $fraTall og $tilTall er " + sum);

        sum = 0;
        int antall = 0;
        for (int i = fraTall; i < tilTall; i += 5) {
            //sum = sum + i;
            //antall = antall+1;
            sum += i;
            antall++;
        }
        double gjennomsnitt = (double) sum / antall;
        System.out.print("Gjennomsnittet av hvert 5. tall mellom " + fraTall);
        System.out.println(" og " + tilTall + " er " + gjennomsnitt);
        // mulitiplikasjonstabell
        int produkt;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                produkt = i * j;
                System.out.println(i + "\t *\t" + j + " \t=\t " + produkt);
            }
        }
        // WHILE LOOP //////////////////////////////////////////////
        //  men - for-løkke er den foretrukne her (et fixed antall)!
        System.out.println("---------");
        int i = 0;
        int j = 0;
        while (i < 10) {
            while (j < 10) {
                produkt = i * j;
                System.out.println(i + "\t *\t" + j + " \t=\t " + produkt);
                j++;
            }
            i++;
            j = 0;
        }
        // finne gjennomsnittet av heltall skrevet inn av bruker
        int sum1 = 0;
        int antall1 = 0;
        int tall = Integer.parseInt(showInputDialog("Skriv inn et heltall, 0 avslutter"));
        while (tall != 0) {
            sum1 += tall;
            antall1++;
            tall = Integer.parseInt(showInputDialog("Skriv inn et heltall, 0 avslutter"));
        }
        double snitt = (double) sum1 / (double) antall1;
        showMessageDialog(null, "Gjennomsnittet ble " + snitt);


        // ** Do-While Loop ** ///////////////////////////////////////////////////
        sum = 0;
        antall = 0;
        tall = 0;

        do {
            sum += tall;
            antall++;
            String innTall = showInputDialog("Skriv inn et heltall avslutt med 0");
            tall = Integer.parseInt(innTall);
        } while (tall > 0);
        gjennomsnitt = (double) sum / (double) (antall - 1);
        showMessageDialog(null, "Gjennomsnittet ble " +
                gjennomsnitt);
    }
}
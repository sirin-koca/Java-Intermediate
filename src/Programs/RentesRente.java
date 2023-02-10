package Programs;

import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class RentesRente {
    public static void main(String[] args) {
        double beløp;   // totalbeløp ved slutten av hvert år
        double grunnbeløp = 1000.0; //grunnbeløpet forrentet
        double rentefot = 0.05; // rentefot pro anno

        // oppretter formateringsobjekt for kronebeløp
        NumberFormat kroneformat = NumberFormat.getCurrencyInstance();

        // oppretter JTextArea for visning av utskrift
        JTextArea tekstområde = new JTextArea();

        // lager overskrift i tekstområdet
        tekstområde.setText("År\tTotalbeløp\n");

        // beregner totalbeløp for hvert år i 10 år
        for (int år = 1; år <= 10; år++) {
            // beregner nytt beløp for gjeldende år
            beløp = grunnbeløp * Math.pow(1.0 + rentefot, år);

            // tilføyer en tekstlinje i tekstområdet
            tekstområde.append(
                    år + "\t" + kroneformat.format(beløp) + "\n");
        } // end for

        // viser resultater
        JOptionPane.showMessageDialog(null, tekstområde,
                "Rentesrente", JOptionPane.INFORMATION_MESSAGE);

    } // end main
} // end klasse


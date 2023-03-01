package programs;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 * Lag en klasse med metoder for å beregne ut i fra en oppgitt vindhastighet i km/t
 * om det er vindstille (mindre enn 2 km/t) og om det er orkan (mer enn 120 km/t).
 * Videre skal klassen kunne beregne hvor mye vindhastigheten tilsvarer på Programs.Beaufort-skala (1-12).
 * Formelen for Programs.Beaufort er : (((vindhastighet i km/t) / 3.01)^0.6666)+0.5.
 * Bruk gjerne Math.pow funksjonen for å foreta beregningen.
 * Til slutt skal det være mulig å regne ut antall knop i en metode. En knop er lik 1.852 meter.
 * Bruk desimal formatering: String.format("%.2f", prisen);
 * Nedenfor illustreres hvordan klassen og metodene skal se ut: **/
class Vind {
    private double vindHastighet = 0.0;
    // Lag en konstruktør for å sette vindhastigheten

    public Vind(double vindHastighet) {
        this.vindHastighet = vindHastighet;
    }

    public double getVindHastighet() {
        return vindHastighet;
    }

    public void setVindHastighet(double vindHastighet) {
        this.vindHastighet = vindHastighet;
    }

    public boolean erOrkan() {
        if (vindHastighet >= 120) {
            return true;
        }
        return false;
    }
    public boolean erVindstille() {
        if (vindHastighet <= 2) {
            return true;
        }
        return false;
    }

    public double getKnop() {
        double knop = vindHastighet / 1.852;
        return knop;
    }
    public int getBeaufort() {
        int beaufort = (int) (Math.pow((vindHastighet / 3.01), 0.6666) + 0.5);
        if(beaufort > 12){
            beaufort = 12;
        }
        return beaufort;
    }
}

public class Beaufort {
    public static void main(String[] args) {
        String innVind = showInputDialog("Skriv inn vindHastighet i km/t:");
        double vind = Double.parseDouble(innVind);

        Vind myVind = new Vind(vind);
        String ut = "The result: \n" +
                "Programs.Beaufort skala: " + myVind.getBeaufort() + "\n" +
                "Orkan risk: " + myVind.erOrkan() + "\n" +
                "Vindstille: " + myVind.erVindstille() + "\n" +
                "Knop: " + String.format("%.2f", myVind.getKnop());

        showMessageDialog(null, ut);

    }
}
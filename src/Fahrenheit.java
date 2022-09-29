//// Når vi skriver static ved import så slipper vi å bruke JOptionPane før showInputDialog
import static javax.swing.JOptionPane.*;

class Converter {

    public static double fraCelsius(double graderCelsius) {
        double fahrenheit = graderCelsius * 9 / 5 + 32;
        //System.out.print(faherenheit); og void først!
        return fahrenheit;
    }

    public static double fraFharenheit(double graderFharenheit) {
        double celsius = (graderFharenheit - 32) * 9 / 5;
        return celsius;
    }
}

public class Fahrenheit {

    //// Driver code : main-metode /////////
    public static void main(String[] args) {

        String valg = showInputDialog("Vil du konvertere fra C eller F ?");
        if (valg.equals("C")) {  // compare String variables
            double celsius = Double.parseDouble(showInputDialog("Skriv inn grader Celsius"));

            String ut = celsius + " grader Celsius er " + Converter.fraCelsius(celsius) + " Fharenheit";
            showMessageDialog(null, ut);
        }
        if (valg.equals("F")) {
            double fharenheit = Double.parseDouble(showInputDialog("Skriv inn grader Fahrenheit"));

            String ut = fharenheit + " grader Fharenheit er " + Converter.fraFharenheit(fharenheit) + " Celsius";
            showMessageDialog(null, ut);
        }
    }
}

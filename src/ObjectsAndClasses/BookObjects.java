package ObjectsAndClasses;

import static javax.swing.JOptionPane.*;

class MyBooks {
    private String tittel;
    private String author;
    private double pris;

    public MyBooks(String tittel, String author, double pris) {
        this.tittel = tittel;
        this.author = author;
        if (pris > 0) {  // NB: Må være med her også!
            this.pris = pris;
        }
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        if (pris > 0) {
            this.pris = pris;
        }
    }

    public double discount(double prosent) {
        double rabatt = pris * (prosent / 100);
        return rabatt;
    }

    public String formaterUt() {
        String ut = "Her er bokinformasjonen : \n" +
                "Tittel :  " + tittel + "\n" +
                "Forfatter :" + author + "\n" +
                "Pris :" + pris + "\n";
        return ut;
    }
}

public class BookObjects {
    //Driver code: main
    public static void main(String[] args) {
        // Definerer paramatre som skal inni Bok-objektet.
        String tittel = showInputDialog("Skriv inn tittel");
        String author = showInputDialog("Skriv inn forfatter");
        String innPris = showInputDialog("Skriv inn prisen");
        double price = Double.parseDouble(innPris); // Input alltid String så vi må bruke Casting for å konvertere til Double

        MyBooks book1 = new MyBooks(tittel, author, price);
        String person = showInputDialog("Ansatt eller student (A eller S)?");
        if (person.equals("A")) {
            double rabatt = book1.discount(15);
            double nyPris = book1.getPris() - rabatt;
            book1.setPris(nyPris);
        }
        String ut1 = book1.formaterUt();
        showMessageDialog(null, ut1);

        // Make a book object and print out:
        MyBooks book2 = new MyBooks(tittel, author, price);
        String ut2 = book2.formaterUt();
        showMessageDialog(null, ut2);

    }
}

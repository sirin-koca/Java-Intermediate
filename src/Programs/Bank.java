package Programs;

class Konto {
    private String personnummer;
    private String navn;
    private double saldo;

    public Konto(String personnummer, String navn, double saldo) {
        this.personnummer = personnummer;
        this.navn = navn;
        this.saldo = saldo;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


/**
 * Bruk Programs.Konto klassen for å skrive ut saldoen.
 **/
public class Bank {
    public static void main(String[] args) {
        Konto sparekonto = new Konto("12345678901", "Per Hansen", 1000);
        Konto lonnskonto = new Konto("12345678901", "Per Hansen", 0);
        sparekonto.setSaldo(2000);
        lonnskonto.setSaldo(3000);
        System.out.println("Sparekontoen tilhører " + sparekonto.getNavn());
        System.out.println("Saldoen til denne er nå " + sparekonto.getSaldo() + " kr");
        System.out.println("Saldoen på lønnskontoen er " + lonnskonto.getSaldo() + " kr");
    }

}
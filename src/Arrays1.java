import java.util.Arrays;

class Person { public String navn;  public int alder; }

public class Arrays1 {
    public static void endrePerson(Person[] innListe, String innNavn) {
        innListe[0].navn = innNavn;
    }

    public static void main(String[] args) {

        int[] liste = {1, 3, 6, 8};
        liste[1] = 23;
        for (int i = 0; i < liste.length; i++) {  // Løper gjennom liste-arrayet
            System.out.print(liste[i] + " ");
        }

        String[] navn = {"Ole", "Line", "Per"}; // Index nr 0-1-2
        navn[2] = "Kari";
        for (String etNavn : navn) {  // Enkel for-løkke : For each loop
            System.out.print(etNavn + " ");
        }

        Person[] personListe = new Person[3];   // Oppretter et nytt array av lengden 3

        Person ole = new Person();   // Oppretter Ole-objektet av Person-klassen
        ole.navn = "Ole";
        ole.alder = 23;

        personListe[0] = ole;  // Allokerer index nr 0 til Ole i personListe-arrayet

        Person line = new Person();  // Oppretter et nytt ojekct med navnet line
        line.navn = "Line";
        line.alder = 19;

        personListe[1] = line;

        System.out.println();

        endrePerson(personListe, "Per");

        for (int i = 0; i < personListe.length; i++) {
            if (personListe[i] != null) {
                System.out.println(personListe[i].navn + " " + personListe[i].alder);
            }
        }

        for (Person enPerson : personListe) {
            if (enPerson != null) {
                System.out.println(enPerson.navn + " " + enPerson.alder);
            }
        }

        int[] liste2 = {1, 4, 6, 2, 7, 8};
        ////////////////////////////////////////////////////////////////////
        //Arrays.sort(liste2);
        for (int verdi : liste2) {   // Enkel for-løkke : For Each Loop
            System.out.print(verdi + " ");
        }
        int[] liste3 = {1, 4, 6, 2, 7, 8};
        if (Arrays.equals(liste2, liste3)) {  //// Sammenligner liste2 og liste3
            System.out.println("Arrayene er like!");
        } else {
            System.out.println("Arrayene er IKKE like!");
        }
    }
}


import java.util.ArrayList;
public class oppgave1 {
    /*
    Definer følgende helttaIIs-ArrayList:1,2,3,4,5,6,7,8,9. Skriv ut element nummer 3 og 6 med System.out
    */

    public static void main(String[] args) {

        // ARRAYS:
        // Det er to måter å opprette arrays i Java:
        // 1) Deklarere array når vi vet hvilke elementer vi har:
        int[] minListe1 = {1, 2, 3, 4, 5};

        System.out.println("PRINT1: La oss skrive ut alle elementene i minliste1:");

        for (int i = 0; i < 5; i++) {
            System.out.println(minListe1[i]);
        }

        minListe1[0] = 89;

        System.out.println("PRINT2: La oss endre første elementet i listen til 89:");

        for (int i = 0; i < 5; i++) {
            System.out.println(minListe1[i]);
        }

        // ARRAYLIST:
        // 2) Deklarere array når vi ikke vet hvilke elementer men vi vet hvor mange plass det skal være i listen
        int[] minListe2 = new int[8];

        ArrayList<Integer> rianasListe = new ArrayList<>();

        for (int i=1; i<=9; i++){
            rianasListe.add(i);
        }

        System.out.println("Element 3: " + rianasListe.get(2));
        System.out.println("Element 3: " + rianasListe.get(5));
    }
}

package programs;

import static javax.swing.JOptionPane.*;

public class JoptionPane {

    public static void main(String[] args) {
        String navn, adresse;
        navn = "Per Hansen";
        adresse = "Osloveien 82";
        String postAdresse = "Oslo";
        String postNr = "0234";
        System.out.println("Navnet er : "+navn);
        System.out.print("Adressen er : ");
        System.out.println(adresse+" "+postNr+" "+postAdresse);
        // Bruk debug for å se variablene blir opprettet

        // Kommenter ut med /* */ hele over for å vise bare meldingsbokser

        // Med input og output bokser

        // Kan skrive String xxx = javax.swing.Programs.JoptionPane.showInputDialog()

        // Vis med CTRL (cmd) + shift for hjelp

        String innNavn1 = showInputDialog("Skriv inn navnet");
        String innAdresse = showInputDialog("Skriv inn adressen");
        String innPostNr = showInputDialog("Skriv inn postnummer");
        String innPostAdresse = showInputDialog("Skriv inn postadresse");
        showMessageDialog(null, innNavn1+" har adressen "+innAdresse);

        // legg ut utskriften i flere linjer i meldingsboksen som for System.out
        String ut = "Navnet : "+innNavn1+"\n"+ // merk her kan vi "brekke linjen"
                "Adressen : "+ innAdresse+" "+innPostNr+" "+innPostAdresse;
        showMessageDialog(null, ut);
        // merk innrykk og ha ting under hverandre!


        /** TALL ** ** Heltall, Desimaltall, Aritmetiske operasjoner **/

        int alderPer = 23;
        int alderLine, sumAlder;
        alderLine = 22;
        sumAlder = alderPer+alderLine;
        System.out.println("Summen av alderen til Per og Line er "+sumAlder);
        // Med input og output bokser
        String innNavn2 = showInputDialog("Skriv inn navnet");
        String innAlder = showInputDialog("Skriv inn alderen");
        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2022-alder;
        showMessageDialog(null, innNavn2+" er født "+fødselsår);
        // desimaltall
        String innString1 = showInputDialog("Skriv inn et desimaltall:"); // kan også sette inn et heltall!
        String innString2 = showInputDialog("Skriv inn et desimaltall til:");
        double innTall1 = Double.parseDouble(innString1);
        double innTall2 = Double.parseDouble(innString2);
        double divisjon = (double) innTall1 / innTall2;
        showMessageDialog(null, innTall1+" delt på "+innTall2+" blir "+ String.format("%.2f", divisjon));
        // hva skjer dersom vi skriver inn et desimal tall for alderen?
        // hva skjer dersom vi skriver inn tekst isteden for desimaltall?
        // hva skjer dersom vi setter 0 i nevneren i divisjonen?

        // heltallsdivisjon
        String innString3 = showInputDialog("Skriv inn et heltall:");
        String innString4 = showInputDialog("Skriv inn et heltall til:");
        int innTall3 = Integer.parseInt(innString3);
        int innTall4 = Integer.parseInt(innString4);
        int divisjon1 = innTall3 / innTall4;
        showMessageDialog(null, innTall3+" delt på "+innTall4+" blir "+divisjon1);
        // hva skjer dersom vi setter 0 i nevneren i heltalls-divisjonen?

        // kode for å unngå feil i innlesning / konvertering til tall
        double tall;
        String innStreng = showInputDialog("Skriv inn et tall:");
        try{
            tall = Double.parseDouble(innStreng);
        }
        catch(Exception e){
            tall = 0;
        }
        showMessageDialog(null, "Du har skrevet: "+tall);
    }
}

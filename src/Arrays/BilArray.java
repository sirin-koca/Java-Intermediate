package Arrays;

class bil{
    private String farge;

    public bil(String farge) {
        this.farge = farge;
    }

    public String getFarge() {
        return farge;
    }
}

public class BilArray {

    private static bil [] liste = new bil[5];
    // dersom vi skal bruke den i flere metoder i denne klassen

    public static void main(String[] args) {
        //Arrays.bil [] liste = new Arrays.bil[5];

        bil volvo = new bil("blå");
        bil audi = new bil("rød");

        liste[0]=volvo;
        liste[1]=audi;
        for (bil enBil : liste){
            if(enBil!=null){
                System.out.println("Denne bilen er "+enBil.getFarge());
            }
        }
    }

}

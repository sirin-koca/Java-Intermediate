package Programs;

public class Avarage2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int teller = 0;

        while (i < 100){
            sum += i;
            i += 2;
            teller++;
        }
        System.out.println("Summen av alle partall mellom 0-98:" + sum);
        double gjennomsnitt = (double) sum/teller;
        System.out.println("Gjennomsnitt er: " + gjennomsnitt);
    }
}

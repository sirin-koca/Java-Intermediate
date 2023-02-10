package Programs;

public class Avarage1 {
    public static void main(String[] args) {

        int sum = 0;
        int teller = 0;
        while (sum < 100){
            sum += 2;
            teller++;
            System.out.println(sum);
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The counter: " + teller);
        System.out.println("The avarege is: " + sum/teller);
    }
}

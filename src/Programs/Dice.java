package Programs;

import java.security.SecureRandom;

public class Dice {
    public static void main(String[] args) {

        int numberThrows = 60_000;

        int cube1 = 0;
        int cube2 = 0;
        int cube3 = 0;
        int cube4 = 0;
        int cube5 = 0;
        int cube6 = 0;

        int letsThrow;

        SecureRandom randomNumber = new SecureRandom();

        for (int i = 0; i < numberThrows; i++) {
            letsThrow = randomNumber.nextInt(6);
            letsThrow ++;

            if ( letsThrow==1){
                cube1++;
            }
            else if ( letsThrow==2){
                cube2++;
            }
            else if ( letsThrow==3){
                cube3++;
            }
            else if ( letsThrow==4){
                cube4++;
            }
            else if ( letsThrow==5){
                cube5++;
            }
            else cube6++;
        }
        String out = "";
        out += "Number of 1's is : " + cube1 + "\n";
        out += "Number of 2's is : " + cube2 + "\n";
        out += "Number of 3's is : " + cube3 + "\n";
        out += "Number of 4's is : " + cube4 + "\n";
        out += "Number of 5's is : " + cube5 + "\n";
        out += "Number of 6's is : " + cube6 + "\n";
        System.out.println(out);
    }

}
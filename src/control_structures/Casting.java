package control_structures;

import java.util.Scanner;

class MainCasting {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       char a = read.next().charAt(0);
       
       int b = (int)a;
       System.out.println(b);
       
    }   
}

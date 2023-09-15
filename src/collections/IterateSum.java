package collections;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class IterateSum {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers, press enter after each: ");
        LinkedList<Integer> nums = new LinkedList<Integer>();

        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }

        int sum = 0;

        Iterator<Integer> it = nums.iterator();

        for(int v : nums){
            int n = it.next();
            sum+=n;
        }

        System.out.println("Sum is : " + sum);
    }
}
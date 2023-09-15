package collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers, press enter after each:");
        while (nums.size() < 5) {
            int num = scanner.nextInt();
            nums.add(num);
        }

        Collections.sort(nums);
        System.out.println("Sorted: " + nums);
        System.out.println("Max value in th elist: " + Collections.max(nums));
        System.out.println("Min value in the list: " + Collections.min(nums));
    }
}

package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File x = new File("C:\\Users\\sirin\\OneDrive\\Dokumenter\\HiCGpt.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next() + " ");
            }
            sc.close();
        } catch (FileNotFoundException e) {
        }
    }
}



package arrays;

public class Dublicate {
    public static void main(String[] args) {
        int[] n = {5, 10, 15, 20, 25, 5};
        int x = n.length;
        for (int i = 0; i < x; i++) {
            if (n[0] == n[i]) {
                System.out.println("Duplicates exist.");
            } else {
                System.out.println("No duplicates");
            }
        }
   }
}

package programs;

import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the matrix multiplication program!");
        System.out.println("Please note that the number of columns (m1) in the first matrix must match the number of rows (n2) in the second matrix.");

        System.out.println("Enter the row (n1) number for 1st matrix");
        int n = sc.nextInt();
        System.out.println("Enter the column (m1) number for 1st matrix");
        int m = sc.nextInt();

        int[][] a1 = new int[n][m];

        System.out.println("Enter the elements of the 1st matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the row (n2) number for 2nd matrix");
        int n1 = sc.nextInt();
        System.out.println("Enter the column (m2) number for 2nd matrix");
        int m1 = sc.nextInt();

        int[][] a2 = new int[n1][m1];

        System.out.println("Enter the elements of the 2nd matrix:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                a2[i][j] = sc.nextInt();
            }
        }

        if (m != n1) {
            System.out.println("Error: the number of columns of the first matrix must match the number of rows of the second matrix.");
            return;
        }

        int[][] result = new int[n][m1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m1; j++) {
                result[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    result[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }

        System.out.println("The result of multiplying the two matrices is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


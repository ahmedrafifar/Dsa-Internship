package Day7;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of star rows: ");
        int n = sc.nextInt();

        // Loop over rows
        for (int i = 1; i <= n; i++) {
            // Loop over columns
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            // Move to the next row
            System.out.println();
        }
    }
}

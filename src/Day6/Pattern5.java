package Day6;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number of stars to print: ");
        int n = sc.nextInt();

        int sp = n / 2;
        int st = 1;

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            // Print stars
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            System.out.println();

            // Logic for upper and lower half
            if (i <= n / 2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
        }
    }
}

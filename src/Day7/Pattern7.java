package Day7;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of star rows: ");
        int n=sc.nextInt();
        int st=1;
        int sp=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=st ; j++) {
                System.out.print("*\t");

            }
            System.out.println();
            for (int j = 1; j <=sp ; j++) {
                System.out.print("\t");

            }
            sp++;

        }
    }
}

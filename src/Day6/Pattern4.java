package Day6;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of stars to print: ");
        int n= sc.nextInt();
       int sp=0;
       int st=1;
        for (int i = 1; i <=n; i++) {
            for (int j =1; j <= sp; j++) {
                System.out.print("\t");
            }
            sp++;
            for (int j =n; j >=st ; j--) {
                System.out.print("*\t");
            }
            st++;
            System.out.println();
        }
    }
}

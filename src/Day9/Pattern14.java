package Day9;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for the table: ");
        int n = sc.nextInt();
        for (int i = 0; i <=10; i++) {
            System.out.println(n+"\t"+"*"+"\t"+i+"\t"+"="+"\t"+i*n);
        }
    }
}

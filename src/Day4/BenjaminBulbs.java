package Day4;

import java.util.Scanner;

class BenjaminBulbs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of bulbs :");
        int n=sc.nextInt();

        for (int i = 1; i*i <= n; i++) {
            System.out.println(i*i);
        }
    }
}

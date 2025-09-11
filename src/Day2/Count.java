package Day2;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (n!= 0) {
            n=n/10;
            count++;
            }
        }
        System.out.println(count);
    }
}
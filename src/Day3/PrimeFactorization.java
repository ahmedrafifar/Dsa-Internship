package Day3;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        for (int div = 2; div * div <= num; div++) {
            while (num % div == 0) {
                num = num / div;
                System.out.print(div+" ");
            }
        }
        if (num != 0) {
            System.out.print(num);
        }
    }
}
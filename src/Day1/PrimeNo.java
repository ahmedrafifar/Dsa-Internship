package Day1;

import java.util.Scanner;
class PrimeNo{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of prime numbers to be print: ");

        for (int i = 1; i <= 20; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;

                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }




    }
}
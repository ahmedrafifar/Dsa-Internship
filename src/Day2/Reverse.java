package Day2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = input.nextInt();
        while(n!=0){
          int  rem=n%10;
            System.out.println(rem);
            n=n/10;
        }
    }
}

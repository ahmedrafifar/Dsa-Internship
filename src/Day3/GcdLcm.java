package Day3;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        System.out.println("Enter a number : ");
        int num2 = input.nextInt();
        int on1=num;
        int on2=num2;
        while(num%num2!=0)
        {
            int r=num%num2;
            num=num2;
            num2=r;
        }
        int gcd=num2;
        System.out.println("The greatest common divisor is "+num2);
        int lcm=(on1*on2)/gcd;
        System.out.println("The least common multiple  is "+lcm);
    }
}

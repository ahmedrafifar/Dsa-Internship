package Day2;

import java.util.Scanner;

class Fiboncci {
    public static void main(String[] args) {
        int a=0;
        int b=1;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter till where to print fibonacci series : ");
        int n=input.nextInt();

        for (int i=1;i<=n;i++) {
            System.out.println(a);
           int c=a+b;
            a=b;
            b=c;
        }

    }
}
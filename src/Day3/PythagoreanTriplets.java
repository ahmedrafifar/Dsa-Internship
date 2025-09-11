package Day3;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = input.nextInt();
        System.out.println("Enter num3 : ");
        int num3 = input.nextInt();

        int max;

        if(num1>num2 && num1>num3){
         max=num1;
        }
        else if(num2>num3){
              max=num2;
        }
        else{
             max=num3;
        }
        if (max==num1) {
            boolean flag = (num1 * num1 == (num2 * num2) + (num3 * num3));
            System.out.println(flag);
        }
        else if (max==num2) {
            boolean flag = (num2 * num2 == (num1 * num1) + (num3 * num3));
            System.out.println(flag);
        }
         else {
            boolean flag = (num3 * num3 == (num2 * num2) + (num1 * num1));
            System.out.println(flag);
        }



        }
    }


package Day1;

import java.util.Scanner;

public class guessthenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int correctnumber=90;
        while (true) {
            System.out.println("Enter the number for guessing:");
            int guess = sc.nextInt();
            if (guess==correctnumber) {
                System.out.println("Correct!");
                break;
            }
            else{
                if(guess>correctnumber){
                    System.out.println("Wrong too high!");
                }
                else{
                    System.out.println("Wrong too low!");
                }
            }
        }
    }
}

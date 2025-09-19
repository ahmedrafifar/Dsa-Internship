package Day11;

import java.util.Scanner;

public class PatternPractise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        int val = 1;
        int rows = n;

        for (int i = 1; i <= n; i++) {
                if(i%2!=0){
            for (int j = 1; j <= rows; j++) {
                System.out.print(val+"\t");
                val++;
                }
                    System.out.println();

            }
                else{
                    for (int j = 1; j <= rows; j++) {
                        System.out.print(val+"\t");
                        val--;
                    }
                    System.out.println();

                }
            if (i%2==0){
                val++;
                val=val+n;
            }
            else{
                val--;
                val=val+n;
            }
        }

    }
}



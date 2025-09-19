package Day11;

import java.util.Scanner;

public class PP {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=scanner.nextInt();
        int sp=0;
        int st=1;
        for (int i = 1; i <=n ; i++) {
            for (int j =1 ; j <=n; j++) {
                if(i==j || j==1||i==n){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }
}

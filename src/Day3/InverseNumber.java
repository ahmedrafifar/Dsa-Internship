package Day3;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        int inv=0;
        int op=1;
        while(n!=0){
            int od=n%10;
            int id=op;
            int ip=od;
            inv=inv+id*(int)Math.pow(10,ip-1);
            n=n/10;
            op++;
        }
        System.out.println(inv);


    }
}

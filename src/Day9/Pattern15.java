package Day9;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int sp=n/2;
        int st=1;
        int val=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=sp ; j++) {
                System.out.print("\t");
            }
            int cval=val;
            for (int j = 1; j <=st ; j++) {
                System.out.print(cval+"\t");
               if (j<=st/2)
               {
                   cval++;
               }
               else{
                   cval--;
               }
            }

            if(i<=n/2){
                st=st+2;
                sp--;
                val++;
            }
            else{
                st=st-2;
                sp++;
                val--;
            } System.out.println();
        }

    }
}

package Day10;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  rows: ");
        int n= sc.nextInt();
        int sp=0;
        int st=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                if(i>1 && i<=n/2){
                    if(j==1 || j==st){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }

                }
                else{
                    System.out.print("*\t");
                }

            }
            if(i<=n/2){
                sp++;
                st=st-2;
            }
            else{
                st=st+2;
                sp--;
            }
            System.out.println();

        }
    }
}

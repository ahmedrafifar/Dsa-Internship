package Day1;

import java.util.Scanner;

class Login{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter username: ");

            String username = sc.nextLine();


            if(username.equals("admin")){
               while(true) {
                   System.out.println("enter your password: ");
                   String password = sc.nextLine();
                   if (password.equals("pass123")) {
                       System.out.println("You are an admin access granted");
                       break;
                   } else {
                       System.out.println("wrong password");

                   }
               }


            }
            else{
                System.out.println("wrong username");
            } break;

    }
}}
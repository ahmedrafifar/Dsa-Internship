package Day4;

import java.util.Scanner;

import static java.lang.System.exit;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HDFC bank atm services");
        System.out.println("sir please enter your pin: ");
        int password = sc.nextInt();
        int correct_pin = 1234;
        int balance = 0;
        int amount = 0;
        while(true) {
            if (password == correct_pin) {
                while(true) {
                    System.out.println( "Transactions available: ");
                    System.out.println("1.Withdrawl");
                    System.out.println("2.Deposit");
                    System.out.println("3.Balance");
                    System.out.println("Exit");
                    System.out.println("Select from above transaction: ");
                    int choice = sc.nextInt();
                    if (choice == 1 || choice == 2) {
                        System.out.println("Enter the amount for the transaction: ");
                        amount = sc.nextInt();
                    }

                    switch (choice) {
                        case 1:
                            if (amount > balance) {
                                System.out.println("insufficient balance ");
                            } else {
                                balance = balance - amount;
                                System.out.println("Transaction successful the " + amount + " has been deducted from the acount");
                                System.out.println("The balance after the withdrawl is :" + balance);

                            }
                            break;
                        case 2:
                            balance = balance + amount;
                            System.out.println("Transaction successful the " + amount + " has been added to the acount");
                            System.out.println("The balance after the deposit is :" + balance);
                            break;
                        case 3:
                            System.out.println("Transaction successful the " + balance+ " is your current balance in this acount");
                            break;
                        case 4:
                            exit(0);
                        default:
                            System.out.println("Enter a valid number for transaction: ");

                    }
                }

            }else {

                System.out.println("password incorrect please re enter: ");
                password=sc.nextInt();
            }
        }

    }
}
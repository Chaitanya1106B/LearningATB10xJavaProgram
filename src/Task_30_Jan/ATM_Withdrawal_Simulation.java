package Task_30_Jan;

import java.util.Scanner;

public class ATM_Withdrawal_Simulation {
    public static void main(String[] args) {

        int account_balance = 10000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to SDET ATM");
        System.out.println("Enter the amount you want to withdraw : ");
        int withdraw = sc.nextInt();

        if(withdraw > account_balance) {
            System.out.println("Sorry, You don't have insufficient funds");
            sc.close();
            return;
        }
        else if (withdraw <=0) {
            System.out.println("Error: Withdrawal amount must be greater than Zero");
            sc.close();
            return;
        }
        else if (withdraw %100 != 0){
            System.out.println("Error : Withdrawal amount must be a multiples of 100");
            sc.close();
            return;
        }
        else account_balance -=withdraw;
        System.out.println("Withdrawal is successful -- Your new balance is: ₹" + account_balance);
    }
}

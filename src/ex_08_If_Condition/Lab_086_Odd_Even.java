package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_086_Odd_Even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}

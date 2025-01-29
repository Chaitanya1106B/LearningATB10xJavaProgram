package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_082_If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt(); // java.util.InputMismatchException

        if (age > 18) {
            System.out.println("Allowed to vote!");
        }
        else {
            System.out.println("Not Allowed!");
        }
    }
}

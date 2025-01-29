package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_087_If_ElseIf_else {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num 2");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("num1");
        }
            else if (num2 > num1) {
            System.out.println("num2");
        } else {
            System.out.println("Equal");


    }

    }
}

package Task_29_Jan;

import java.util.Scanner;

public class number_positive_negative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number (+ or - )");

        int num = sc.nextInt();

        if (num >=0)
            System.out.println("Entered number is positive");
        else
            System.out.println("Entered number is negative");

    }
}

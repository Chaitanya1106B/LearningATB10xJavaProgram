package Task_30_Jan;

import java.util.Scanner;

public class smallest_2_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 2 numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 < num2)
            System.out.println("Smallest number is " +num1);
        else
            System.out.println("Smallest number is " +num2);

    }
}
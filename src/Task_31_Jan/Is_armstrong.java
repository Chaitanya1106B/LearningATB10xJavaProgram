package Task_31_Jan;

import java.util.Scanner;

public class Is_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int num = sc.nextInt();
        int temp = num;
        int sum =0;

        while (num > 0)
        {
            int eachDigit = num%10;
            num = num/10;
            sum = sum+(eachDigit*eachDigit*eachDigit);
        }
        if (temp==sum)
        {
            System.out.println("It's an Armstrong number");
        }
        else {
            System.out.println("It's not an Armstrong number");
        }
    }
}

package Task_31_Jan;

import java.util.Scanner;

public class Travel_Status {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Visa Travel status check");
        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter visa status : True / False");
        boolean status = sc.nextBoolean();

        if (age >= 18 && status){
            System.out.println("Congrats! you are eligible to travel");
        } else if ( age<=0 ) {
            System.out.println("Enter the valid details");
        } else{
            System.out.println("Sorry, you are not eligible to travel.");
        }
    }
}

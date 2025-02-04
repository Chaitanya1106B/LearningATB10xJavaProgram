package Task_29_Jan;


import java.util.Scanner;

public class Eligible_to_vote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of the person : ");

        int age = sc.nextInt();

        if (age>=18)
            System.out.println("Congrats! you are eligible to vote");
        else
            System.out.println("Sorry, you are not eligible to vote");

    }
}

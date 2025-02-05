package Task_31_Jan;

import java.util.Scanner;

public class Loan_eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Loan Eligibility check");

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        if (age <= 0) {
            System.out.println("Invalid Age: Age cannot be zero or negative.");
        } else if (age < 18) {
            System.out.println("You must be at least 18 years old to apply for a loan.");
        } else if (age > 80) {
            System.out.println("Age exceeds the maximum limit for loan eligibility.");
        } else {

            if (salary <= 0) {
                System.out.println("Invalid Salary: Salary must be a positive number.");
            } else if (salary < 30000) {
                System.out.println("Salary is too low to be eligible for a loan.");
            } else {

                if (creditScore <= 0) {
                    System.out.println("Invalid Credit Score: Credit score must be a positive number.");
                } else if (creditScore < 650) {
                    System.out.println("Your credit score is too low to qualify for a loan.");
                } else if (creditScore > 850) {
                    System.out.println("Credit score exceeds the maximum limit.");
                } else {

                    System.out.println("You are eligible for a loan.");
                }
            }
        }



    }
}

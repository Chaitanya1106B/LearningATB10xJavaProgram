package Challanges;


import java.util.Scanner;

public class Grade_Calculator_EdgeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score!");
        int score = sc.nextInt();
//        char grade = 'F'; // default value of local variable is good practice.
        char grade; // default value of local variable is good practice.

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score <= 0 || score > 100) {
            grade = 'O';
            System.out.println("LOL, You are God Level!");
        } else {
            grade = 'F';
        }

        System.out.println("Your Grade is -> " + grade);
    }
}

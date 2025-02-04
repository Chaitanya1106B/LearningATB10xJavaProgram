package Task_30_Jan;

import java.util.Scanner;

public class Grade_basedon_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks you have got : ");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("You got A+ grade");
        } else if (score >= 80 && score <= 89) {
            System.out.println("You got A grade");
        } else if (score >= 70 && score <= 79) {
            System.out.println("You got B grade");
        } else if (score >= 60 && score <= 69) {
            System.out.println("You got C grade");
        } else if (score >= 50 && score <= 59) {
            System.out.println("You got D grade");
        } else if (score >= 40 && score <= 49) {
            System.out.println("You got E grade");
        } else if (score <= 0 || score > 100) {
            System.out.println("Please enter valid score");
        } else {
            System.out.println("You are failed");
        }
    }
}

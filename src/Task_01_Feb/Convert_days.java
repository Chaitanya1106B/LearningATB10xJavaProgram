package Task_01_Feb;

import java.util.Scanner;

public class Convert_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days : ");

        int daysInYear = 360;
        int daysInMonth = 30;
        int totalDays = sc.nextInt();

        int years = totalDays / daysInYear;
        int remainingDays = totalDays % daysInYear;

        int months = remainingDays / daysInMonth;
        remainingDays = remainingDays % daysInMonth;

        if (years > 0 || months > 0 || remainingDays > 0) {
            System.out.print(totalDays + " days is equal to: ");
            if (years > 0) {
                System.out.print(years + " years, ");
            }
            if (months > 0) {
                System.out.print(months + " months, ");
            }
            System.out.println(remainingDays + " days.");
        } else {
            System.out.println("Invalid input or zero days.");
        }
    }
}

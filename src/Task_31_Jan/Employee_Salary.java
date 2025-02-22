package Task_31_Jan;

import java.util.Scanner;

public class Employee_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator for employee salary check");
            System.out.print("Enter Basic Pay: ");
            double basicPay = sc.nextDouble();

            System.out.print("Enter HRA: ");
            double hra = sc.nextDouble();

            System.out.print("Enter DA: ");
            double da = sc.nextDouble();

            System.out.print("Enter Tax Deduction: ");
            double taxDeduction = sc.nextDouble();

            double grossSalary = basicPay + hra + da;
            System.out.println("Gross Salary: " + grossSalary);

            double netSalary = grossSalary - taxDeduction;

            if (netSalary > 0) {
                System.out.println("Net Salary: " + netSalary);
            } else if (netSalary == 0) {
                System.out.println("Net Salary is zero");
            } else {
                System.out.println("Net Salary is negative, check the tax deductions or inputs.");
            }
    }
}

package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_090_3sides_triangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side A: ");
        double sideA = sc.nextDouble();

        System.out.print("Enter the length of side B: ");
        double sideB = sc.nextDouble();

        System.out.print("Enter the length of side C: ");
        double sideC = sc.nextDouble();

        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Invalid input: Side lengths must be positive.");
        } else {

            if (sideA == sideB && sideB == sideC && sideA == sideB) {
                System.out.println("The triangle is equilateral.");
            } else if (sideA == sideB || sideA == sideB || sideA == sideB) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scalene.");
            }
        }

        sc.close();
    }
}

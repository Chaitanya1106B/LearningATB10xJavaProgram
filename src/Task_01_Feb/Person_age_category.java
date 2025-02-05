package Task_01_Feb;

import java.util.Scanner;

public class Person_age_category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age<=12)
            System.out.println("You are a CHILD");
        else if (age<=19) {
            System.out.println("You are a TEENAGER");
        } else if (age<=64) {
            System.out.println("You are an ADULT");
        } else
            System.out.println("You are a SENIOR CITIZEN");
    }
}

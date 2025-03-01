package ex_18_OOPs_Constructors;

import java.util.Scanner;

public class Lab_165_Cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the model name of tesla");

        Car_2 tesla = new Car_2("tesla 3", 2024);
        System.out.println(tesla.model);
        System.out.println(tesla.year);


        Car_2 nano = new Car_2("nano 3", 2013);
        System.out.println(nano.model);
        System.out.println(nano.year);

    }
}

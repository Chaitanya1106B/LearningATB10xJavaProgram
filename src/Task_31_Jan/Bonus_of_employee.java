package Task_31_Jan;

import java.util.Scanner;

public class Bonus_of_employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonus check");

        System.out.println("Enter your current salary : ");
        double salary = sc.nextDouble();

        System.out.println("Enter your current experience : ");
        float exp = sc.nextFloat();

        if(exp < 1)
            System.out.println("No Bonus & Current salary remains same : " + salary);
        else if (exp>=1 && exp<3)
        {
            System.out.println("Congrats! you got a 5% bonus & Current sal is : " + ((salary*0.05)+ salary) );
        } else if (exp>=3 && exp<6)
        {
            System.out.println("Congrats! you got a 10% bonus & Current sal is : " + ((salary*0.1)+ salary) );
        }
        else
            System.out.println("Congrats! you got a 15% bonus & Current sal is : " + ((salary*0.15)+ salary) );

    }
}

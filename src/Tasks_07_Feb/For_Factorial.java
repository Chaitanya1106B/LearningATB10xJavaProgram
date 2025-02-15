package Tasks_07_Feb;

import java.util.Scanner;

public class For_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }System.out.println("Factorial of "+num+ " is "+fact );
    }
}

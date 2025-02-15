package Tasks_07_Feb;

import java.util.Scanner;

public class For_Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Multiplication upto ? ");
        int range = sc.nextInt();
        int result = 0;
        for(int i=1; i<=range; i++)
        {
            result = num*i;
            System.out.println(num +"*"+i+"="+result);
        }
    }
}

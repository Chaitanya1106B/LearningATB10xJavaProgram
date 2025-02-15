package Tasks_07_Feb;

import java.util.Scanner;

public class While_Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Multiplication upto ? ");
        int range = sc.nextInt();
        int result = 0;
        int i =1;
        while(i<=range){
            System.out.println(num+ "x" +i+ "=" +(num*i));
            i++;
        }

    }
}

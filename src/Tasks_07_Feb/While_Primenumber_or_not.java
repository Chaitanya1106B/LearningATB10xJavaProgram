package Tasks_07_Feb;

import java.util.Scanner;

public class While_Primenumber_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
            System.out.println(num + " is not a prime number.");
        } else {
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            System.out.println(num + " is a prime number.");
        }
    }
}

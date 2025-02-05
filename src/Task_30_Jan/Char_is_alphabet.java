package Task_30_Jan;

import java.util.Scanner;

public class Char_is_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any of the alphabet/number/symbol : ");

        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}

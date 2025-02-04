package Task_29_Jan;

import java.util.Scanner;

public class character_vowel_consonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the alphabet : ");

        char ch= sc.next().charAt(0);
        char ch1 =Character.toLowerCase(ch);
        if(ch1 =='a'|| ch1 =='e'|| ch1 =='i'|| ch1 =='o'|| ch1 =='u')
            System.out.println("Entered alphabet is vowel");
        else
            System.out.println("Entered alphabet is consonant");

    }
}

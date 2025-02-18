package ex_16_Arrays;

import java.util.Arrays;

public class Lab_147_Array_For {
    public static void main(String[] args) {
        int[] marks = {51, 100, 25, 62, 99};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("----------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks); // 25,51,62,99,100
    }
}

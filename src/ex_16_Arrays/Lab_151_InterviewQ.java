package ex_16_Arrays;

import java.util.Arrays;

public class Lab_151_InterviewQ {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(numbers); // 1,3,4,10,12,32,34,100

        System.out.println(numbers[numbers.length - 2]);
    }
}

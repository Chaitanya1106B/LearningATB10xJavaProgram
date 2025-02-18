package ex_16_Arrays;

public class Lab_144_Arrays {     // array is collection of data which is of similar type
    public static void main(String[] args) {
        int a = 10;

        int[] marks = {80,90,89,52,35};

        System.out.println(marks.length);  // 5 length starts with 1, index starts with 0
        System.out.println(marks[1]); // 90

        // System.out.println(marks[-1]); // java.lang.ArrayIndexOutOfBoundsException
        // System.out.println(marks[10]);


    }
}

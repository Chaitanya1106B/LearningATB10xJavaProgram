package ex_16_Arrays;

public class Lab_145 {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5,6};

        int[] marks2 = new int[5];  // fixed size.
        System.out.println(marks2.length);

        String s1 = "Chaitanya";
        System.out.println(s1.length());

        System.out.println(marks2[1]);   // default will be set as zero

        marks2[0] = 90;
        marks2[1] = 12;
        marks2[2] = 13;
        marks2[3] = 14;
        marks2[4] = 15;

        System.out.println(marks2[0]);
        System.out.println(marks2[4]);
        System.out.println(marks2[10]); // ArrayIndexOutOfBoundsException

    }
}

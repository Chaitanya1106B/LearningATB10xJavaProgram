package ex_24_Exception;

public class Lab_205 {
    public static void main(String[] args) {

        int a = 0;
        int b= 10;
        int c = b/a;
        System.out.println(c);

        // unchecked expection -- / by zero --  ArithmeticException, NullPointerException

        String name = null;
        name.trim();  // trim removes the spaces

        // java.lang.NullPointerException: Cannot invoke "String.trim()"


    }
}

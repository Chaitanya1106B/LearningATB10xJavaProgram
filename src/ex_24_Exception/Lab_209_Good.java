package ex_24_Exception;

public class Lab_209_Good {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10/c;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}

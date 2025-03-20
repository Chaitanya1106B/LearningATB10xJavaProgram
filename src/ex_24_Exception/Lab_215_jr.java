package ex_24_Exception;

public class Lab_215_jr {      // not a good practice lab_214 is alternative
    public static void main(String[] args) {
        String ip = null; // java.lang.ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int a = 0; // NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        int b = 0; // ArithmeticException
        try {
            b = 100 / a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}

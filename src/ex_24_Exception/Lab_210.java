package ex_24_Exception;

public class Lab_210 {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
             c = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}

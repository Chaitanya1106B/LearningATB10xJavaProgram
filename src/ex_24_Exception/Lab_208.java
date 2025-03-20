package ex_24_Exception;

public class Lab_208 {
    public static void main(String[] args) {

        int c = 0;
        int b = 0;
        try {
            b = 10/c;
        } catch (ArithmeticException e) {   // only when we know what exception is cmng we can say it
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
                System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}

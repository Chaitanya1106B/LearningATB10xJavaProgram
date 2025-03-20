package ex_24_Exception;

public class Lab_204_Exceptions {
    public static void main(String[] args) {

        System.out.println("Start of program");
        String ip = args[0];  // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
        int a = Integer.parseInt(ip);     // java.lang.NumberFormatException: For input string: "chaitu"
        int b = 100/a;        // java.lang.ArithmeticException: / by zero when args -> 0
        System.out.println(b);
        System.out.println("End of program");


        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "chaitu"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds

    }

}

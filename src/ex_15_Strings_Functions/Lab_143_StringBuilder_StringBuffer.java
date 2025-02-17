package ex_15_Strings_Functions;

public class Lab_143_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        StringBuffer sBuffer = new StringBuffer("Chaitanya ");
        sBuffer.append("Bh");

        System.out.println(sBuffer);

        sBuffer.reverse();
        System.out.println(sBuffer);


        StringBuilder sBuilder = new StringBuilder("Chaitanya ");
        sBuilder.append("Bh");

        System.out.println(sBuilder);

        sBuilder.append(" World!");
        System.out.println(sBuilder); // Output: Chaitanya Bh World!
    }
}

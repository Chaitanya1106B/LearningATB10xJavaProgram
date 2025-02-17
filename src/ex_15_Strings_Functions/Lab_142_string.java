package ex_15_Strings_Functions;

public class Lab_142_string {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"

        System.out.println(s3);
        System.out.println(s1.concat(s2));

        StringBuilder sb = new StringBuilder("Chaitanya ");
        sb.append("Bh");
        System.out.println(sb);

        // StringBuffer , StringBuilder - 2 more ways to create strings.
    }
}

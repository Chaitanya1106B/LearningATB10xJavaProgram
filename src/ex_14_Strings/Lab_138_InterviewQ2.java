package ex_14_Strings;

public class Lab_138_InterviewQ2 {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP  // 1
        String s4 = "Hello"; // SCP  // 1

        String s2 = new String("Hello"); //OA  -- 1
        String s3 = new String("Hello"); // -- 2
        String s5 = new String("hello");  // OA = 3

        // == ?  Comparsion -> Strings -> This check the locations ref.
//        System.out.println(s1 == s3);  False
//        System.out.println(s1 == s2);  F
//        System.out.println(s2 == s3);  F

//        System.out.println(s1 == s4);  True
//        System.out.println(s3 == s5);  F

        // equals ( content) -> value
        // How can I check the values? equals == value

        System.out.println(s1.equals(s2)); // T
        System.out.println(s2.equals(s3)); // F
        System.out.println(s3.equals(s5)); // F
        System.out.println(s3.equalsIgnoreCase(s5)); // T
    }
}

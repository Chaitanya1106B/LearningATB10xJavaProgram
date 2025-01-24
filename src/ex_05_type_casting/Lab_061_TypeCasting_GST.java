package ex_05_type_casting;

public class Lab_061_TypeCasting_GST {
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;

       // int total_int = course+GST; // Narrowing - Implicit
        int total_int = course + (int)GST;  // Narrow - Explicit ( not recommended)
        float total = course+GST; // Widenning - implicit
        float total2 = (float) course+GST; // Widenning _ Explicit
        System.out.println(total);
    }
}

package ex_05_type_casting;

public class Lab_057_Type_casting {
    public static void main(String[] args) {
        byte b = 10;
       // int a = b;  // valid --> Implicit Casting Automatically it will happen

        int a = (int)b; // Valid -> Explicit Casting

        System.out.println(b);
    }
}
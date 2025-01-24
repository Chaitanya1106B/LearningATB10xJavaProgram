package ex_05_type_casting;

public class Lab_060_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 963258741l;

     //   short s = phone_no;   -- Implicit invalid
        short s = (short)phone_no;  // =-- Explicit possible
    }


}

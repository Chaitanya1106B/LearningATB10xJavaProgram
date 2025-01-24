package ex_05_type_casting;

public class Lab_059_Type_casting_Narrowing {

    public static void main(String[] args) {

        int val = 200;
       // byte b = val;  Invalid - Implicit casting narrowing

        byte b = (byte)val; // Valid Explicit casting - narrowing and overflow will happen

        // data loss will happen as we are filling the bigger value in small container
    }
}

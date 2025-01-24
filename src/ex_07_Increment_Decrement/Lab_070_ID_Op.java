package ex_07_Increment_Decrement;

public class Lab_070_ID_Op {

    public static void main(String[] args) {

        // pre - increment - ++operand.
        // value is incremented first and then stored in the result.

        int a = 10;
        int b = ++a; //( ++a = a+1)

        System.out.println(b);
        System.out.println(a);  // ++a means increase the value of a and assiging it to b

        //  Exp and Result Table
        // Line No | a | Result b
        // 10 | 10 | NA
        // 11  | 11 | 11
        // 13   | NA | 11
        // 14   | 11 | NA

    }
}

package ex_23_Wrapper_Class;

public class Lab_202_Wrapper {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a; // boxing - int -> integer - JVM auto boxing

        System.out.println(Integer.MIN_VALUE);
        System.out.println(b.intValue());

        Integer a2= 42;
        int v = a2; // unboxing
        System.out.println(v);


    }
}

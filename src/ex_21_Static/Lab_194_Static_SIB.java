package ex_21_Static;

public class Lab_194_Static_SIB {
    public static void main(String[] args) {
        A a = new A();
    }

}

class A{
    static {
        System.out.println("Called only Once when class is loaded");
        System.out.println("You can write a code reading a excel, file, db");
    }
    static int a = 10;
    static void m1(){
        System.out.println("Static function");
    }
}

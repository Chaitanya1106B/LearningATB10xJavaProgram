package ex_20_OOPS_Super_Abstraction;

public class Lab_191 {
    public static void main(String[] args) {
        Chaitanya C = new B();  // Dynamic Dispatch will Interface
        B c1 = new B();         // Dynamic Dispatch will Interface

        C.display();
        System.out.println(C.a);
    }

}
class B implements Chaitanya{

    @Override
    public void display() {
        System.out.println(a);
    }
}


interface Chaitanya{
    public int a = 10;
    void display();
}

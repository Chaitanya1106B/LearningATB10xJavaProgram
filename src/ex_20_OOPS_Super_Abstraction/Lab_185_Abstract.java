package ex_20_OOPS_Super_Abstraction;

public class Lab_185_Abstract {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50K();
        c.loan25k();

    }
}

// abstract class - cannot be instantiated
abstract class Father{
    abstract void loan50K();
    void loan25k(){
        System.out.println("given 20k");
    }
}

class Child extends Father{

    @Override
    void loan50K() {
        System.out.println("Child will pay the loan");
    }
}


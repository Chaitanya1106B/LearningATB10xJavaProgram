package ex_20_OOPS_Super_Abstraction;

public class Lab_184_Private {

}

class XYZ{
    private int my_gold = 10;
}

class CAB extends XYZ{
    void display(){
        // System.out.println(super.my_gold); // as my_gold is private it is cant be used.
    }
}

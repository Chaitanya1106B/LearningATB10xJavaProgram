package ex_20_OOPS_Super_Abstraction;

public class Lab_187_Interface_p1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.drive();
    }
}

class Car1 implements Engine1 , Breaks{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();

    }

    @Override
    public void applyBreak() {
        System.out.println("Apply break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine");

    }
}



interface Engine1{
    void startEngine();
    void stopEngine();

}
interface Breaks{
    void applyBreak();
}

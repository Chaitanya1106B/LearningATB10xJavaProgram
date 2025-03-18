package ex_20_OOPS_Super_Abstraction;

public class Lab_182 {
    public static void main(String[] args) {

    }
}

// single inheritance
class Car extends vehicle{

  private int maxSpeed = 280;

  Car(){
      super(100);
  }

  void test(){

  }

  Car(int a){
      System.out.println("PC car");
  }

  @Override
  void display(){

      System.out.println("Override car");
      System.out.println(super.maxSpeed);
      System.out.println(this.maxSpeed);
      this.test();
  }

}



class vehicle{
    public int maxSpeed = 180;

    vehicle(){
        System.out.println("Default constructor");
    }

    vehicle(int a){
        System.out.println("Param Cons");
    }

    // Method overloading - same name same function with diff arguments

    void message(){
        System.out.println("No argument, No return");
    }

    void message(int a ){
        System.out.println("PC- Argument");
    }

    void display(){
        System.out.println("Vehicle parent");
    }

}


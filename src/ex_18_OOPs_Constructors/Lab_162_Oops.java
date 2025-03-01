package ex_18_OOPs_Constructors;

public class Lab_162_Oops {
    public static void main(String[] args) {

        baby b1 = new baby();
        baby b2 ; // here only the reference is created not the object so the class is not called

        new baby();   // class will be called as the object is created

    }
}

class baby{
    String name;

    baby(){
        System.out.println("I am called, Object is created");
    }

    // Instance initialization block
    {
        System.out.println("Step-1 - Called db before working !!");
    }

}

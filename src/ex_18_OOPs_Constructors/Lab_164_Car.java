package ex_18_OOPs_Constructors;

public class Lab_164_Car {
    public static void main(String[] args) {
        Car tesla = new Car();

        tesla.name = "Tesla Model N";
        System.out.println(tesla.name);
        System.out.println(tesla.year); // default value
        System.out.println(tesla.model); // default value


        Car nano = new Car();
        nano.name = "TT nano";
        System.out.println(nano.name);

    }
}

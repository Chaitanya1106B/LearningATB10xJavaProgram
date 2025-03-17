package ex_19_OOPS_part2.Poly.methodoverridding;

public class Lab_175 {
    public static void main(String[] args) {
        Son s = new Son();
        s.home();


        Father f = new Father();
        f.home();

        Father f2 = new Son(); // Dynamic dispatch
        f2.home();   // method overriding - ridden the father method


    }
}

package ex_19_OOPS_part2.Poly.methodoverloading;

public class Lab_174_MOloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();

        int r = m1.add(3,4);
        System.out.println(r);


        int r1 = m1.add(3,4,5);
        System.out.println(r1);

        // depending on the arguments (a,b,c or a,b) it will work is method overloading.


        double r0 = m1.add(3.35,4.85);
        System.out.println(r0);
    }
}

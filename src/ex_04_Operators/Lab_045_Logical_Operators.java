package ex_04_Operators;

public class Lab_045_Logical_Operators {
    public static void main(String[] args) {

        boolean a = true;
        System.out.println(!a);

        boolean b = false;
        System.out.println(!!b);

        boolean c = true || false;
        System.out.println(c);

        // == compare the values

        System.out.println(10 == 10);
        System.out.println(10 < 10);

        System.out.println(!(10>20));
        System.out.println(!!!!(20<9));



    }
}

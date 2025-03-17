package ex_19_Inheritence.Multileval_Inheritance;

public class Lab_170_Multileval {
    public static void main(String[] args) {
        Son chaitanya = new Son();
        Father F = new Father();
        GrandFather gf = new GrandFather();

        chaitanya.home();  // as son has home it will take 1st. // GF is last priority.

        // Son s1 = new GrandFather();
        // Son s1 = new Father();
        // Son amit = new Son();

        GrandFather g1 = new Son();
        GrandFather g2 = new Father();
        Father f2 = new Son();
        // Father f3 = new GrandFather();
    }
}

package ex_21_Static;

public class Lab_193_Static_p2 {
    public static void main(String[] args) {
        ATB naresh = new ATB(996635857,"naresh");

        System.out.println(naresh.phone_np);
        System.out.println(ATB.course_name);
        ATB.m1();

        // Primitive variable (not objects) Java is not 100% oops

    }

}

class ATB{
    static String course_name="ATB";
    int phone_np;
    String name;

    public ATB(int phone_np, String name){
        this.phone_np = phone_np;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_np + this.name + course_name);
    }

    static void m1(){
        System.out.println("mark attendance");
    }

}

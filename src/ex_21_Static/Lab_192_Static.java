package ex_21_Static;

public class Lab_192_Static {
    public static void main(String[] args) {
        student s1 = new student(23);
        student s2 = new student(33);

        System.out.println(s1.age);
        System.out.println(s2.age);


        System.out.println(student.course_name);
        student.m1();

    }

    }

    class student {
        int age;  // non static

        static String course_name = "ATB";


        public student(int age_c){
            this.age = age_c;
    }

    static void m1(){
        System.out.println("I'm static method");
    }

}

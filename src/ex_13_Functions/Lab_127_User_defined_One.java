package ex_13_Functions;

public class Lab_127_User_defined_One {
    public static void main(String[] args) {

        // User Defined Functions.
        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type


        // 1.Without Argument / Parameters and Without Return Type.
        greet();

        // 2.Without Parameters but With Return Type
        String s =greet_with_hello();
        System.out.println(s);

        int age_to_vote_person = age_to_vote();
        System.out.println("Age to vote is : " + age_to_vote_person);

        // 3.With Parameters and Without Return Type
        greet_with_name("Chaitanya");
        greet_with_fullname("Chaitanya ","B");

        // 4. With Parameters and With Return Type
        int sum = sum_of_two_numbers(3,4);
        int sum2 = sum_of_three_numbers(4,5,7);
        System.out.println(sum);
        System.out.println(sum2);
    }
    // 1.Without Argument / Parameters and Without Return Type.
    static void greet(){
        System.out.println("Hi, i'm Without Parameters and Without Return Type ");
    }

    // 2.Without Parameters but With Return Type

    static String greet_with_hello(){
        return "Hi, this is example 2";
    }
    static int age_to_vote(){
        return 18;
    }

    // 3.With Parameters and Without Return Type
    static void greet_with_name(String name){
        System.out.println("Hi your name is "+ name);
    }
    static void greet_with_fullname(String firstname, String lastname){
        System.out.println("Hi your full name is "+ firstname + lastname);
    }

    // 4. With Parameters and With Return Type
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
    static int sum_of_three_numbers(int a, int b, int c){
        return a+b+c;
    }
}

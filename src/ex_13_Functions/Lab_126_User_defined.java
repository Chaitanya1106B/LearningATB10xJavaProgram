package ex_13_Functions;

public class Lab_126_User_defined {
    public static void main(String[] args) {

        // Step-2 calling the below function

        main();
        greet();
    }
        // Step 1 - Declaration / Define
        static void main(){
            System.out.println("Hi, another Look like of main");
        }

        // Without Parameters and Without Return Type.
        // no parameter/argument and no return type
        static void greet(){
            System.out.println("Hi, How are you?");
        }
    }

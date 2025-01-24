package ex_07_Increment_Decrement;

public class Lab_069_Increment_Decrement_Op {

    public static void main(String[] args) {

        //Take inputs

        String age_string = args[0];
        int age= Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);

        // 28 95 24 65

      //  System.out.println(args[4]); // java.lang.ArrayIndexOutOfBoundsException

        String canIgoGoa = age>=25 ? "Yes" : "No";
        System.out.println(canIgoGoa);
    }
}

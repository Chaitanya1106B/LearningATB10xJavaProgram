package ex_06_Ternary_Operator;

public class Lab_068_Age_Classification {

    public static void main(String[] args) {

        int age =68;

        // Adult, Minor, Senior
        //  Senior > 65,
        // Minor < 18
        // Adult > 18

        String result = (age < 18) ? "Minor" : ((age<65) ? "Adult" : "Senior");
        System.out.println(result);
    }
}

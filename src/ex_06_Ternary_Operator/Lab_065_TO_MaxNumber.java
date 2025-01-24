package ex_06_Ternary_Operator;

public class Lab_065_TO_MaxNumber {

    public static void main(String[] args) {

        //Find the maximum number between 2 numbers
        // x and y --> Max x, y  -- ternary op

        int x= 10;
        int y = 20;

        int max = x>y ? x : y ;
        System.out.println(max);
    }
}

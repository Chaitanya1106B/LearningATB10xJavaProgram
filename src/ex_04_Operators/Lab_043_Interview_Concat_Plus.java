package ex_04_Operators;

public class Lab_043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String name1= "Chaitanya";
        String name2= "B";
        int a =10;
        int b =10;

        System.out.println(name1 + name2 + a + b);

        // ChaitanyaB1010 --> first operator -- performed concatenation
        // so all it will be taken as string without math.

        System.out.println(a + b + name1 + name2);
        // 20ChaitanyaB --> first operator is math

        System.out.println(name1 + name2 + (a + b));
        // ChaitanyaB20 -->BODMAS -- Bracket of div, mul, add, sub

//                - B: Brackets
//                - O: Order (powers, indices, or roots)
//                - D: Division
//                - M: Multiplication
//                - A: Addition
//                - S: Subtraction







    }
}

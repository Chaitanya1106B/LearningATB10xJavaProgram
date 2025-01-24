package ex_04_Operators;

public record Lab_037_Arthemetic_Operators() {
    public static void main(String[] args) {
         //Arithmetic Operators

        //    1. `+`   (Addition)
        //    2. `-`   (Subtraction)
        //    3. `*`   (Multiplication)
        //    4. `/`   (Division)
        //    5. `%`   (Modulo)  -- Remainder


        int a = 20;
        int b = 3;
        float c = 3f;

        System.out.println(a+ b);
        System.out.println(a- b);
        System.out.println(a* b);
        System.out.println(a/b);  //6
        System.out.println(a/ c);   // 6.666666

    }
}

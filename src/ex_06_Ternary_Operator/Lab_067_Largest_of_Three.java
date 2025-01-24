package ex_06_Ternary_Operator;

public class Lab_067_Largest_of_Three {

    public static void main(String[] args) {
         // Finding largest number n1,n2,n3 ==> Max(n1,n2,n3)

        // Step 1 : Find inputs /outputs
        // n1,n2,n3 -> data type -> int
        // o/p ->  int
        // 100,34,10 ->  100


        // Step 2 :  rough logic
//        n1 >= n2  -> Y1 :  N1
//        Y1 ->  n1 >= n3 : Y (n1) : N (n3)
//        N1 ->  n2 > n3  : Y (n2) : N (n3)

        int n1=15, n2 = 10, n3= 5;

        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest number:" +largest);


    }
}

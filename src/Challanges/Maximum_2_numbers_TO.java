package Challanges;

public class Maximum_2_numbers_TO {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);


        int largest = (n1 >= n2) ? n1 : n2;
        System.out.println("largest number is " + largest);


    }
}

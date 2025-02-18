package ex_16_Arrays;

public class Lab_150_Sum_of_Array {
    public static void main(String[] args) {

        int[] num = {12,34,10};
        int sum = 0;

//        for (int i = 0; i < num.length; i++) {
//            sum = sum + num[i];
//        }
//        System.out.println(sum);

        for(int n : num){
            sum = sum +n;
        }
        System.out.println(sum);

    }
}

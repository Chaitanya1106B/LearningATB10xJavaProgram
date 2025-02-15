package Tasks_07_Feb;

public class While_sum_of_1to100 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("sum of 1 to 100 :" +sum);
    }
}

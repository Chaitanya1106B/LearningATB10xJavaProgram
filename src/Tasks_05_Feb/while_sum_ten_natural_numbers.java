package Tasks_05_Feb;

public class while_sum_ten_natural_numbers {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("sum of 10 natural numbers :" +sum);
    }
}

package Tasks_05_Feb;

public class for_sum_ten_natural_numbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum of 10 natural numbers : "+ sum);
    }
}

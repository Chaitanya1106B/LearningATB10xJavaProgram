package ex_24_Exception;

public class Lab_221_Custom_expection {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        Bank jp_chase = new Bank("USD",101);
//        int result = sbi.add(icici);;
        int result = sbi.add(jp_chase);;
        System.out.println(result);

    }
}

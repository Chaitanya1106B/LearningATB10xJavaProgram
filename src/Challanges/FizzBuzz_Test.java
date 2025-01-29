package Challanges;

public class FizzBuzz_Test {
    //Write a program that prints numbers from 1 to 100.
    //However, for multiples of 3,print "Fizz" instead of the number,and for multiples of 5,print"Buzz."
    // For numbers that are multiples of both 3 and 5, print "FizzBuzz."

    public static void main(String[] args) {

        for (int n = 1 ; n<=100; n++ ){
            if (n % 3 == 0 && n % 5 ==0) {  //
                System.out.println("FizzBuzz");
            } else if (n%3==0) {
                System.out.println("Fizz");
            }
                else if (n%5 ==0){
                    System.out.println("Buzz");
                }
                else {
                System.out.println(n);
            }

            }
        }





    }


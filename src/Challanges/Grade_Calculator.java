package Challanges;

public class Grade_Calculator {
    public static void main(String[] args) {

        int score = 50;

        if (score >= 90 && score <=100 )
            System.out.println("You got grade : A ");
        else if (score>80 && score <=89)
            System.out.println("You got grade : B");
        else if (score>70 && score <=79)
            System.out.println("You got grade : C");
        else if (score>60 && score <=69)
            System.out.println("You got grade : D");
        else if (score<59 )
            System.out.println("You got grade : F");


    }
}

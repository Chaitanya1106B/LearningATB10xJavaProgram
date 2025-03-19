package ex_22_Enum;

public class Lab_198_Enum_p2 {
    public static void main(String[] args) {
        System.out.println(URLS.google);
        if (URLS.google.equals("google")){
            System.out.println("I want to do");
        }

    }
}

enum URLS{
    google, restassured ;
}

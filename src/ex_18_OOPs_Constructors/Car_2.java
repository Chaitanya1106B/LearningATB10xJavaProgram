package ex_18_OOPs_Constructors;

public class Car_2 {

    String model ;
    int year;


    Car_2(){
        model = "XXX";
        year = 0000;

        System.out.println("DC");
    }

    // paramitarised cons
    Car_2(String model_name, int year_created){
        this.model = model_name;
        this.year = year_created;
    }

}

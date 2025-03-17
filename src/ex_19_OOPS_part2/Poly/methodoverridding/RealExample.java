package ex_19_OOPS_part2.Poly.methodoverridding;

public class RealExample {

    public static void main(String[] args) {
        TC t1 = new TC();
        t1.OpenBrowser();

        TC2 t2 = new TC2();
        t2.OpenBrowser();
    }
}


class CommonToAllTC{
    void OpenBrowser(){
        System.out.println("Open the browser in 5 sec");
    }
}

class TC extends CommonToAllTC{
    void startTC(){
        OpenBrowser();
    }
}
class TC2 extends CommonToAllTC{
    @Override
    void OpenBrowser(){
        System.out.println("Open the browser in 2 sec");
    }
}

package ex_19_OOPS_part2.accessmodifier.Police;

public class Cop {

    public int gun;
    String iCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void CanIShoot(){
        System.out.println("Yes, you can shoot");
    }
}

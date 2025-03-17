package ex_19_OOPS_part2.Encap.RealExample;

public class Lab_177 {
    public static void main(String[] args) {

        ICICIBank chaitu = new ICICIBank("Chaitu",10000);
        System.out.println(chaitu.getBal());

        boolean isCashier  = true;
        chaitu.setBal(100000, isCashier);
        System.out.println(chaitu.getBal());
        System.out.println(chaitu.bank_name);

    }
}
class ICICIBank {
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.


    private String name;
    private long bal;
    public String bank_name = "ICICI";

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the balance");
        }
    }
}

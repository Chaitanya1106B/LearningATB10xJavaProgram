package ex_19_OOPS_part2.Encap;

public class Lab_176 {
    public static void main(String[] args) {

     VWOlogin vwOlogin = new VWOlogin("chaitu", "word");
        System.out.println(vwOlogin.password);
        vwOlogin.password = "345";
        System.out.println(vwOlogin.password);


     GoodEcapVWOlogin vwOlogin1 = new GoodEcapVWOlogin("ramu", "raju");

     vwOlogin1.setUsername("King");
        System.out.println(vwOlogin1.getUsername());


        boolean isAdmin = true;
        vwOlogin1.setPassword("159", true);
        System.out.println(vwOlogin1.getPassword());

    }
}

class VWOlogin{
    String username;
    String password;

    public VWOlogin(String usr, String pwd){
        this.username = usr;
        this.password = pwd;
    }

}

class GoodEcapVWOlogin{
   private String username;
   private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password , boolean isAdmin)
    {
        if(isAdmin){
            this.password = password;
        }else {
            System.out.println("Not allowed to change pwd");
        }
    }

    public GoodEcapVWOlogin(String usr, String pwd){
        this.username = usr;
        this.password = pwd;
    }
}

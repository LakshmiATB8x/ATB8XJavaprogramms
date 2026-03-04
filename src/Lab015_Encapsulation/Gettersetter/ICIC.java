package Lab015_Encapsulation.Gettersetter;

public class ICIC {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance(boolean isadmin) {

        if(isadmin)
        {
            System.out.println("Showbalanvce"+10000);
        }
        else
        {
            System.out.println("Non authorised person");
        }
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private  String name;
  private  int balance;




}

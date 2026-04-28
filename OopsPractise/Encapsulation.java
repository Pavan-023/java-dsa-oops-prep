package OopsPractise;
import java.util.*;
class BankAccount{
    private String acno;
    private int bal;
    int amt;
    public void setString(String acno){
        this.acno=acno;
    }
    public void setBal(int bal){
        this.bal=bal;
    }
    public String getString(){
        return acno;
    }
    public int getBal(){
        return bal;
    }
    public void deposite(int amt){
      if (amt > 0) {
            bal += amt;
            System.out.println("Deposited: " + amt + ", New balance: " + bal);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
        
    }
    public void withdraw(int amt){
        if(amt >bal){
            System.out.println("Not Sufficatant money in your acoount");
        }
        System.out.println(Math.abs(bal-(this.amt=amt)));
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba= new BankAccount();
        ba.setBal(502);
        ba.setString("BR453A");
        System.out.println(ba.getBal());
        System.out.println(ba.getString());
        ba.deposite(10);
        ba.withdraw(1000);
    }
}

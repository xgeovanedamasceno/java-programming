package xd.geo.aelum.oop;

public class CheckingAccount extends BankAccount {

    CheckingAccount(Date date, String name) {
        super(date, name);
    }

    @Override
    public void getType() {
        System.out.println("Checking Account");
    }


    public void transfer(double value, BankAccount destiny) {
        super.transfer(value, destiny);
        super.setBalance(super.getBalance() - 0.10);
    }


}

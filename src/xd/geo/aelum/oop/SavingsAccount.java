package xd.geo.aelum.oop;

public class SavingsAccount extends BankAccount {


    SavingsAccount(Date date, String name) {
        super(date, name);
    }

    @Override
    public void getType() {
        System.out.println("Savings Account");
    }
}

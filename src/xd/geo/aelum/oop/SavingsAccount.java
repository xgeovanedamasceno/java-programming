package xd.geo.aelum.oop;

public class SavingsAccount extends BankAccount {


    SavingsAccount(Date date, String name) {
        super(date, name);
    }

    @Override
    public void getType() {
        System.out.println("Savings Account");
    }

    public void transfer(double value, BankAccount destiny) {
        super.transfer(value, destiny);
        super.setBalance(super.getBalance() - 1.00);
    }
}

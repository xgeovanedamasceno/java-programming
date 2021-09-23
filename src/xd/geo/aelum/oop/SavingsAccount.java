package xd.geo.aelum.oop;

public class SavingsAccount extends BankAccount {


    public SavingsAccount(Date date, String name) {
        super(date, name);
    }



    @Override
    public void transfer(double value, BankAccount destiny) {
        super.transfer(value, destiny);
        super.setBalance(super.getBalance() - 1.00);
    }

    @Override
    public void getDataForPrint() {
        System.out.println(this.getType());
        super.getDataForPrint();
    }

    @Override
    protected String getType() {
        return "Savings Account";
    }
}

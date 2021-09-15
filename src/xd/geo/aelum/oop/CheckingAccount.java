package xd.geo.aelum.oop;

public class CheckingAccount extends BankAccount {

    CheckingAccount(Date date, String name) {
        super(date, name);
    }

    @Override
    public String getType() {
        return "Checking Account";
    }

    @Override
    public void transfer(double value, BankAccount destiny) {
        super.transfer(value, destiny);
        super.setBalance(super.getBalance() - 0.10);
    }

    @Override
    public void getDataForPrint() {
        System.out.println(this.getType());
        super.getDataForPrint();
    }


}

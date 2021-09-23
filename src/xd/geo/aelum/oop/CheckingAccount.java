package xd.geo.aelum.oop;

public class CheckingAccount extends BankAccount implements Taxable {

    public CheckingAccount(Date date, String name) {
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

//    @Override
//    public int compareTo(BankAccount otherAc) {
//        if (this.getBalance() < otherAc.getBalance()) return -1;
//        else if (this.getBalance() > otherAc.getBalance()) return 1;
//        return 0;
//    }

    @Override
    public void getDataForPrint() {
        System.out.println(this.getType());
        super.getDataForPrint();
    }


    @Override
    public double getTaxValue() {
        return this.getBalance() * 0.01;
    }
}



package xd.geo.aelum.oop;

public class BankAccountTest {
    public static void main(String[] args) {

        Date date = new Date(31,2,2021);

        BankAccount svAc = new SavingsAccount(date, "Mark");
        BankAccount ckAc = new CheckingAccount(date, "Zoe");

        svAc.put(1000);
        ckAc.put(2000);

        ckAc.transfer(500, svAc);

        svAc.transfer(0.10, ckAc);

        svAc.getDataForPrint();


        ckAc.getDataForPrint();






    }
}

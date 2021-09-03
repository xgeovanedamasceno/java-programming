package xd.geo.aelum.oop;

public class BankAccountTest {
    public static void main(String[] args) {

        Date date = new Date(31,2,2021);

        BankAccount acc = new BankAccount(date, "Mark");
        BankAccount acb = new BankAccount(date, "Zoe");

        acc.getDataForPrint();
        acb.getDataForPrint();


    }
}

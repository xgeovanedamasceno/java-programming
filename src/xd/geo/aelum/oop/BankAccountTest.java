package xd.geo.aelum.oop;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.name = "Geovane";
        acc.number = 1245;
        acc.balance = 200.00;
        acc.openingDate = "02/09/2021";

        System.out.println(acc.name);
        System.out.println(acc.number);
        System.out.println(acc.balance);
        System.out.println(acc.openingDate);

        acc.withdraw(50);
        System.out.println(acc.balance);
        acc.put(25);
        System.out.println(acc.balance);

        System.out.println(acc.calcIncome());

    }
}

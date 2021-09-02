package xd.geo.aelum.oop;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.name = "Mark";
        acc.number = 1245;
        acc.balance = 200.00;
        acc.openingDate = "02/09/2021";

        acc.retrievesDataForPrint();


        acc.withdraw(50);
        System.out.println(acc.balance);
        acc.put(25);
        System.out.println(acc.balance);

        System.out.println(acc.calcIncome());

        BankAccount acb = acc;



        if(acc == acb) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}

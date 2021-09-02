package xd.geo.aelum.oop;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setName("Mark");
        acc.put(200.00);

        Date date = new Date();
        date.day = 2;
        date.month = 8;
        date.year = 2021;

        acc.setOpeningDate(date);
        acc.retrievesDataForPrint();

        acc.withdraw(50);
        System.out.println(acc.getBalance());
        acc.put(25);
        System.out.println(acc.getBalance());

        System.out.println(acc.calcIncome());

        BankAccount acb = acc;

        if(acc == acb) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }




    }
}

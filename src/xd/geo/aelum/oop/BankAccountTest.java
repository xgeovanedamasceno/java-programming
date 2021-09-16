package xd.geo.aelum.oop;

public class BankAccountTest {
    public static void main(String[] args) {

        Date date = new Date(31,2,2021);

        BankAccount svAc = new SavingsAccount(date, "Mark");
        BankAccount ckAc = new CheckingAccount(date, "Zoe");

        try {
            svAc.put(1000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            ckAc.put(2000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }



        try {
            ckAc.transfer(500, svAc);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            svAc.transfer(0.10, ckAc);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        svAc.getDataForPrint();


        ckAc.getDataForPrint();

        try {
            svAc.put(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }





    }
}

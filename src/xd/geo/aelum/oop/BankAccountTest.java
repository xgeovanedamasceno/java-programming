package xd.geo.aelum.oop;

public class BankAccountTest {
    public static void main(String[] args) {

        Date date = new Date(31,2,2021);

        BankAccount svAc = new SavingsAccount(date, "Mark");
        BankAccount ckAc = new CheckingAccount(date, "Zoe");

        svAc.setNumberAccount("1235");
        svAc.setNumberAgency("456");
        ckAc.setNumberAccount("123");
        ckAc.setNumberAgency("456");

        var ret = ckAc.equals(svAc);
        System.out.println(ret);

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
            ckAc.transfer(-500, svAc);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            svAc.transfer(0.10, ckAc);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");

        svAc.getDataForPrint();




        ckAc.getDataForPrint();

        try {
            svAc.put(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("*********");

        System.out.println(svAc.toString());
        System.out.println(ckAc.toString());

    }
}

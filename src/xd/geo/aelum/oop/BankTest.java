package xd.geo.aelum.oop;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Date date = new Date(21,9,2021);

        BankAccount bc = new CheckingAccount(date, "Charles");
        bc.put(5000);
        bc.setNumberAgency("10");
        bc.setNumberAccount("12");
        bank.add(bc);

        BankAccount ca = new CheckingAccount(date, "Mary");
        ca.put(3500);
        ca.setNumberAgency("10");
        ca.setNumberAccount("13");
        bank.add(ca);

        BankAccount sa = new SavingsAccount(date, "Peter");
        sa.put(7892);
        sa.setNumberAgency("10");
        sa.setNumberAgency("14");
        bank.add(sa);

        bank.displayAccounts();

        BankAccount df = new SavingsAccount(date, "Joyce");
        df.setNumberAgency("10");

        System.out.println(bank.contains(df));

        bank.add(df);

        System.out.println(bank.contains(df));






    }
}

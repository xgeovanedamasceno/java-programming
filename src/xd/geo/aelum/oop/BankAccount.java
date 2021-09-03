package xd.geo.aelum.oop;

public class BankAccount {
    static int number;
    private int id;
    private String name;

    private double balance;
    private Date openingDate;

    BankAccount(Date date, String name) {
        BankAccount.setNumber();
        this.setId();
        this.setOpeningDate(date);
        this.setName(name);
    }

    private static void setNumber() {
        BankAccount.number += 1;
    }

    public static int getNumber() {
        return BankAccount.number;
    }

    public int getId() {
        return this.id;
    }

    private void setId() {
        this.id = BankAccount.getNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String getOpeningDate() {
        return this.openingDate.getFormattedDate();
    }

    private void setOpeningDate(Date date) {
        this.openingDate = date;
    }

    public boolean withdraw(double value) {
        this.balance = this.balance - value;
        return true;
    }

    public boolean put(double value) {
        this.balance = this.balance + value;
        return true;
    }

    public double getYield() {
        return this.balance * 0.01;
    }

    public void getDataForPrint() {
        // sout here ?
        System.out.println("Account Name: " + this.getName());
        System.out.println("Account Number: " + this.getId());
        System.out.println("Account Balance: " + this.getBalance());
        System.out.println("Account Opening Date: " + this.getOpeningDate());
    }




}

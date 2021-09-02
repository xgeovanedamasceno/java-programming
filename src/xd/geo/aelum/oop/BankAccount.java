package xd.geo.aelum.oop;

public class BankAccount {
    private String name;
    static int number;
    private int id;
    private double balance;
    private Date openingDate;

    BankAccount() {
        BankAccount.number += 1;
        this.id = BankAccount.getNumber();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumber() {
        return BankAccount.number;
    }

    public double getBalance() {
        return balance;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    boolean withdraw(double value) {
        this.balance = this.balance - value;
        return true;
    }

    boolean put(double value) {
        this.balance = this.balance + value;
        return true;
    }

    double calcIncome() {
        return this.balance * 0.01;
    }

    void retrievesDataForPrint() {
        // sout here ?
        System.out.println("Account Name: " + this.getName());
        System.out.println("Account Number: " + this.getId());
        System.out.println("Account Balance: " + this.getBalance());
        System.out.println("Account Opening Date: " + this.getOpeningDate().formattedDate());
    }




}

package xd.geo.aelum.oop;

public class BankAccount {
    String name;
    int number;
    double balance;
    String openingDate;

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
        System.out.println("Account Name: " + this.name);
        System.out.println("Account Number: " + this.number);
        System.out.println("Account Balance: " + this.balance);
        System.out.println("Account Opening Date: " + this.openingDate);
    }




}

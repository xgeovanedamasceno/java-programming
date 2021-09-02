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

    double calculaRendimento() {
        return this.balance * 0.01;
    }




}

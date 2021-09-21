package xd.geo.arrays;

import xd.geo.aelum.oop.BankAccount;
import xd.geo.aelum.oop.CheckingAccount;
import xd.geo.aelum.oop.Date;

public class ArraysTest {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[10];
        Date date = new Date(21,9,2021);
        for (int i = 0; i < 10; i++) {
            double value = (i + 1) * 100;
            bankAccounts[i] = new CheckingAccount(date, "Customer" + i);
            try {
               bankAccounts[i].put(value);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        for (BankAccount i : bankAccounts) {
            System.out.println(i.getName());
            System.out.println(i.getBalance());
        }

        double sumBalance = 0;
        double average = 0;
        for (BankAccount i : bankAccounts) {
            sumBalance += i.getBalance();
            average = sumBalance / bankAccounts.length;
        }
        System.out.println(average);
    }
}

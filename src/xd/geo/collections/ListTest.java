package xd.geo.collections;

import xd.geo.aelum.oop.BankAccount;
import xd.geo.aelum.oop.CheckingAccount;
import xd.geo.aelum.oop.Date;
import xd.geo.aelum.oop.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<BankAccount> listAc = new ArrayList<>();

        Date today = new Date(23,9,2021);

        BankAccount ab = new CheckingAccount(today, "Charles");
        BankAccount bc = new SavingsAccount(today, "Francis");
        BankAccount cd = new SavingsAccount(today, "Patrick");
        BankAccount de = new CheckingAccount(today, "Erik");

        for (int i = 0; i < listAc.size(); i++) {
//            random here
        }


    }
}

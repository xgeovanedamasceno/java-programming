package xd.geo.collections;

import xd.geo.aelum.oop.BankAccount;
import xd.geo.aelum.oop.CheckingAccount;
import xd.geo.aelum.oop.Date;
import xd.geo.aelum.oop.SavingsAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mark");
        list.add("Gilbert");
        list.add("Paul");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Date date = new Date(23,9,2021);
        BankAccount ck = new CheckingAccount(date, "Ted");
        ck.put(1000);

        BankAccount tck = new CheckingAccount(date, "Mary");
        tck.put(2000);

        BankAccount sv = new SavingsAccount(date, "Matthew");
        sv.put(4500);

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(ck);
        accounts.add(tck);
        accounts.add(sv);

//        Collections.sort(accounts);





    }
}

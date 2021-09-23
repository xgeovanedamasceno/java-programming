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
        ck.put(3500);

        BankAccount tck = new CheckingAccount(date, "Mary");
        tck.put(2000);

        BankAccount sv = new SavingsAccount(date, "Matthew");
        sv.put(1999);

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(ck);
        accounts.add(tck);
        accounts.add(sv);

        System.out.println(accounts);
        Collections.sort(accounts);
        System.out.println(accounts);

        var p = Collections.binarySearch(accounts,ck);
        System.out.println(p);
        System.out.println(Collections.max(accounts));
        System.out.println(Collections.min(accounts));
        Collections.reverse(accounts);
        System.out.println("Reverse: " + accounts);
        Collections.rotate(accounts, 2);
        System.out.println("Rotate: " + accounts);
        Collections.shuffle(accounts);
        System.out.println("Shuffle: " + accounts);





    }
}

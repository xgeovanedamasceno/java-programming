package xd.geo.exceptions;

import xd.geo.aelum.oop.CheckingAccount;
import xd.geo.aelum.oop.Date;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("Start main()");
        try {
            method1();
        }
        catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
        System.out.println("End main()");
    }

    static void method1() {
        System.out.println("Start method1()");
        method2();
        System.out.println("End method1()");
    }

    static void method2() {
        System.out.println("Start method2()");
        Date date = new Date(16,9,2021);
        CheckingAccount ca = new CheckingAccount(date, "Geo");

        for (int i = 0; i <= 15; i++) {
            ca.put(i + 1000);
            System.out.println(ca.getBalance());
            if (i == 5) {
                ca = null;
            }
        }
        System.out.println("End method2()");
    }
}

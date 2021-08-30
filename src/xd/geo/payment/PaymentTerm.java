package xd.geo.payment;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PaymentTerm {
    public static void main(String[] args) {

        var read = new Scanner(System.in);

        System.out.println("Say the day:\n");
        var day = read.nextInt();
        System.out.println("Say the month:\n");
        var month = read.nextInt();
        System.out.println("Say the year:\n");
        var year = read.nextInt();

        System.out.println("The date is " + day + " " + month + " " + year);

        Calendar dueDate = new GregorianCalendar();

        dueDate.set(year, month, day);
        System.out.println(dueDate.getTime());

        System.out.println(dueDate.getInstance());

    }
}


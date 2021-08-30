package xd.geo.birthdate;

import java.util.Date;
import java.util.GregorianCalendar;

public class BirthDate {
    public static void main(String[] args) {
        var myBirthDay = new GregorianCalendar(1992,4,1);

        System.out.println(myBirthDay.getTimeInMillis());

        var myBirthTimeInMillis = myBirthDay.getTimeInMillis();

        var myBirthDate = new Date(myBirthTimeInMillis);

        System.out.println(myBirthDate);



    }
}

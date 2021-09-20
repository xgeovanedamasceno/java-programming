package xd.geo.lang;

import java.io.PrintStream;

public class LangTest {
    public static void main(String[] args) {

        PrintStream exit = System.out;
        exit.println("Hello World");

        String im = "TodayIsMonday 19";
        im = im.replace("19", "20");
        System.out.println(im);
        System.out.println(im.length());
        System.out.println(im.contains("Monday"));
        System.out.println(im.contains("monday"));
        im = im.trim();
        System.out.println(im);
        String emptyString = "     ";
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString.isBlank());
        System.out.println(im.isEmpty());
        System.out.println(im.isBlank());

        var today = im;
        System.out.println(today.length());
        StringPlay.loop(today);

        StringPlay.inverse(today);

        System.out.println(im.length());
        String ot = "Tomorrow it will be Tuesday and the forescat is saying that will continues hot";
        System.out.println("Ot.length: " + ot.length());
        System.out.println("im.length: " + im.length());
        System.out.println(ot.length()+im.length());





    }
}

package xd.geo.lang;

public class StringPlayBuilder {
    public static void main(String[] args) {
        String im = "TodayIsMonday 20";
        var stsum = im + "b";
        StringBuilder sb = new StringBuilder(stsum);
        System.out.println(sb.capacity());

        StringBuilder names = new StringBuilder();
        names.append("Rose>").append("Charles>").append("Mathew>").append("Mary");

        System.out.println(names);

        names.insert(13,"Elizabeth>");

        char[] newAr = new char[10];

        names.getChars(0, 10, newAr, 0);

//        for(char n : newAr) System.out.print(n);

        names.delete(1,5);

        System.out.println(names);

        names.deleteCharAt(1);

        System.out.println(names);
    }
}

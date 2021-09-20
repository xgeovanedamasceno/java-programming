package xd.geo.lang;

public class StringPlayBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Today");

        var rec = sb.append("IsMonday");
        System.out.println(sb+"IsMonday");
        System.out.println(sb);
        System.out.println(rec);
    }
}

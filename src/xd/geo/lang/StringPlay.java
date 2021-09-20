package xd.geo.lang;

public class StringPlay {

    public static void loop(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }

    public static void inverse(String text) {
        StringBuilder bText = new StringBuilder(text);
        for (int i= bText.length()-1; i >= 0; i--)
            System.out.print(bText.charAt(i));
    }



}

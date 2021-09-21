package xd.geo.arrays;

public class SplitTest {

    public static void main(String[] args) {
        String sentence = "Socorram-me, subi no ônibus em Marrocos";
        String[] words =  sentence.split(" ");

        for (String w : words) {
            System.out.println(w);
        }

        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }



}

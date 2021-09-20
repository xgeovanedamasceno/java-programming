package xd.geo.lang;

public class StringBattleTest {

    public static void main(String[] args) {
//        String he = "Hello";
//        he = he.concat(" Geovane");
//        he += "!";
//
//        System.out.println(he);

        String text = "";
        for (int i = 0; i < 65537; i ++ ) {
            text += "b";
        }
        System.out.println(text);

        text = "";

        long nStart =  System.currentTimeMillis();

        System.out.println(nStart);

        for (int i = 0; i < 100000; i++) {
            text += "b";
        }

        long nEnd = System.currentTimeMillis();
        long nResult = nEnd - nStart;

        System.out.println("Run time String: " + nResult);

        StringBuilder bext = new StringBuilder();
        nStart = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            bext.append("b");
        }

        nEnd = System.currentTimeMillis();
        nResult = nEnd - nStart;
        System.out.println("Run time String Builder: " + nResult);

        StringBuffer fext = new StringBuffer();
        nStart = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            fext.append("b");
        }

        nEnd = System.currentTimeMillis();
        nResult = nEnd - nStart;
        System.out.println("Run time String Buffer: " + nResult);
    }
}

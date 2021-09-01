package xd.geo.aelum.exer.sintaxe.chapthree;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1L;
        for(int n = 1; n <= 20; n++) {
            fact = fact * n;
            System.out.println(fact);
        }
    }
}

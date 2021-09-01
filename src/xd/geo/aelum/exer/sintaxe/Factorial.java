package xd.geo.aelum.exer.sintaxe;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        for(int n = 1; n <= 20; n++) {
            fact = fact * n;
            System.out.println(fact);
        }
    }
}

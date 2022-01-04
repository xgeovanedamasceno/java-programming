public class Main {
    public static void main(String[] args) {
        Pile myPile = new Pile();

        myPile.push(new NodeLifo(10));
        myPile.push(new NodeLifo(20));
        myPile.push(new NodeLifo(30));
        myPile.push(new NodeLifo(40));
        

        System.out.println(myPile);


    }
}
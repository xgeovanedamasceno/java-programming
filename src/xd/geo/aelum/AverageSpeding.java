package xd.geo.aelum;

public class AverageSpeding {
    public static void main(String[] args) {
        double jan = 15.000;
        double feb = 23.000;
        double mar = 17.000;

        double quartExpense, averageSpend;

        quartExpense = jan + feb + mar;

        System.out.println(quartExpense);

        averageSpend = quartExpense / 3;

        System.out.println(averageSpend);
    }
}

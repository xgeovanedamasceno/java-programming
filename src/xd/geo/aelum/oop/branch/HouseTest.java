package xd.geo.aelum.oop.branch;

public class HouseTest {
    public static void main(String[] args) {
        House houseWhite = new House();
        houseWhite.paint("Purple");


        System.out.println("Quantidade de portas: " + houseWhite.getLengthDoor());

        Door one = new Door("One");
        one.open();

        Door two = new Door("Two");
        two.open();

        Door three = new Door("Three");
        three.close();


        houseWhite.addDoor(one);
        houseWhite.addDoor(two);
        houseWhite.addDoor(three);

        System.out.println("Quantidade de portas: " + houseWhite.getLengthDoor());

        houseWhite.showDoors();

        houseWhite.totalDoors();

        System.out.println("Open Doors: " + houseWhite.HowManyDoorsAreOpen());

        houseWhite.setDoor(three,true);

        System.out.println("Open Doors: " + houseWhite.HowManyDoorsAreOpen());


    }
}

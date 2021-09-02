package xd.geo.aelum.oop.branch;

public class HouseTest {
    public static void main(String[] args) {
        House white = new House();
        white.paint("Yellow");;
        white.doorOne.open();
        white.doorTwo.open();
        white.doorThree.open();

        int q = white.howManyDoorAreOpen();
        System.out.println(q);

        white.doorTwo.close();
        q = white.howManyDoorAreOpen();

        System.out.println(q);

    }
}

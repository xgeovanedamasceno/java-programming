package xd.geo.aelum.oop.branch;

public class DoorTest {
    public static void main(String[] args) {
        Door d = new Door();

        d.sizeX = 1.1;
        d.sizeY = 1.8;
        d.sizeZ = 0.05;

        d.open();

        if(d.isOpen()) {
            System.out.println("The door is open");
        } else {
            System.out.println("The door is closed");
        }

        d.close();
        if(d.isOpen()) {
            System.out.println("The door is open");
        } else {
            System.out.println("The door is closed");
        }
    }
}

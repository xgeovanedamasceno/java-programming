package xd.geo.aelum.oop.branch;

public class House {
    String color;
    String Address;
    Door doorOne = new Door();
    Door doorTwo = new Door();
    Door doorThree = new Door();

    void paint(String color) {
        this.color = color;
    }

    int howManyDoorAreOpen() {
        int doors = 0;
        if(doorOne.isOpen()) {
            doors += 1;
        }
        if(doorTwo.isOpen()) {
            doors += 1;
        }
        if(doorThree.isOpen()) {
            doors += 1;
        }

        return doors;
    }
}

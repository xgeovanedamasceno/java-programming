package xd.geo.aelum.oop.branch;

public class Door {
    boolean open = false;
    String color;
    double sizeX;
    double sizeY;
    double sizeZ;

    void open() {
        this.open = true;
    }

    void close() {
        this.open = false;
    }

    boolean isOpen() {
        return this.open;
    }

    void paint(String color) {
        this.color = color;
    }

}

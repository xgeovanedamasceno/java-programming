package xd.geo.aelum.oop.branch;

public class Door {
    private boolean open = false;
    private String color;
    private String name;

    Door(String name) {
        this.name = name;
    }


    public void open() {
        this.open = true;
    }

    public void close() {
        this.open = false;
    }

    public boolean isOpen() {
        return this.open;
    }

    void paint(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
}

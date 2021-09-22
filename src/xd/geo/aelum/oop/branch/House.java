package xd.geo.aelum.oop.branch;

public class House {
    private String color;
    private String Address;
    private Door[] doors;
    private int totalDoors = 0;

    public void paint(String color) {
        this.color = color;
    }

    public void addDoor(Door ndoor) {

        if(this.totalDoors > 0) {
            var length = this.doors.length;
            Door[] auxArray = new Door[length];
            for (int i = 0; i < length; i++) {
                auxArray[i] =  this.doors[i];
            }
            this.doors = new Door[length+1];
            for (int i = 0; i < length; i++) {
                this.doors[i] = auxArray[i];
            }
            this.doors[length] = ndoor;
            this.totalDoors = this.doors.length;
        } else {
            this.doors = new Door[1];
            this.doors[1-1] = ndoor;
            this.totalDoors = this.doors.length;
        }

    }

    public void showDoors() {
        System.out.println("Show Doors:");
        for (int i = 0; i < this.doors.length; i++) {
            System.out.println(this.doors[i].getName());
        }
    }

    public int HowManyDoorsAreOpen() {
        int count = 0;
        for (int i = 0; i < this.doors.length; i++) {
            if (this.doors[i].isOpen()) count++;
        }
        return count;
    }

    public void totalDoors() {
        System.out.println("Total Doors: " + this.totalDoors);
    }

    public int getLengthDoor() {
        if(this.doors != null) return this.doors.length;
        else return 0;
    }

    public void setDoor(Door door, boolean status) {
        for (int i = 0; i < this.doors.length; i++) {
            if (this.doors[i] == door) {
                if (status == true) this.doors[i].open();
                else this.doors[i].close();
            }
        }
    }
}

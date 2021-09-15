package xd.geo.aelum.oop;

public class Manager extends Employee {

    private int numberOfAssistants;
    private String password;

    public double getBonus() {
        return this.getSalary() * 0.15;
    }
}

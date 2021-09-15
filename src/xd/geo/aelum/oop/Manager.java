package xd.geo.aelum.oop;

public class Manager extends Employee {

    private int numberOfAssistants;
    private String password;

    @Override
    public double getBonus() {
        return super.getBonus() + 1000;
    }
}

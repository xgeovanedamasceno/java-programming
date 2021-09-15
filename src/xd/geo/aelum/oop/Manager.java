package xd.geo.aelum.oop;

public class Manager extends Employee {

    private int numberOfAssistants;
    private String password;

    @Override
    public double getBonus() {
        double v = super.getSalary() * 0.15;
        return v;
    }
}

package xd.geo.aelum.oop;

public class Employee {
    private String name;
    private String cpf;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return getSalary() * 0.10;
    }
}

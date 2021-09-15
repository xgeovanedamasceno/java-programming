package xd.geo.aelum.oop;

public abstract class Employee {
    private String name;
    private String cpf;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double getBonus();
}

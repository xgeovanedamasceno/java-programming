package xd.geo.aelum.oop;

public class EmployeeTest {

    public static void main(String[] args) {
        Manager man1 = new Manager();

        man1.setSalary(1000);
        System.out.println(man1.getBonus());

        Manager man2 = new Manager();
        Employee emp1 = man2;
        emp1.setSalary(2000);
        System.out.println(emp1.getBonus());
    }
}

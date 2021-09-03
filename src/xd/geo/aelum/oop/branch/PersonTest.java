package xd.geo.aelum.oop.branch;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Angela";
        p.age = 34;

        p.makesBirthday();

        System.out.println(p.name);
        System.out.println(p.age);
    }
}

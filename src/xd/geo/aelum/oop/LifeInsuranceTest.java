package xd.geo.aelum.oop;

public class LifeInsuranceTest {
    public static void main(String[] args) {
        LifeInsurance li1 = new LifeInsurance(45);

        System.out.println(LifeInsurance.getNumber());
        System.out.println(li1.getId());

        LifeInsurance li2 = new LifeInsurance(45);

        System.out.println(LifeInsurance.getNumber());
        System.out.println(li2.getId());
    }
}

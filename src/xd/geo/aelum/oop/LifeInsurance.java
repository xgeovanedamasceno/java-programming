package xd.geo.aelum.oop;

public class LifeInsurance implements Taxable {
    private static int number;
    private int id;
    private double value = 42.00;

    LifeInsurance(double value) {
        this.setValue(value);
        LifeInsurance.setNumber();
        this.setId();
    }

    private static void setNumber() {
        LifeInsurance.number += 1;
    }

    public static int getNumber() {
        return LifeInsurance.number;
    }

    private void setId() {
        this.id = LifeInsurance.getNumber();
    }

    public int getId() {
        return this.id;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value + this.getTaxValue();
    }

    @Override
    public double getTaxValue() {
        return this.getValue() * 0.02;
    }
}

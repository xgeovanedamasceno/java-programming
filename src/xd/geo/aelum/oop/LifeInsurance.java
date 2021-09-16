package xd.geo.aelum.oop;

public class LifeInsurance implements Taxable {
    private double value = 42.00;

    LifeInsurance(double value) {
        this.setValue(value);
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

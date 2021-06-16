package day53_inheritance.tesla;

public class Modelx extends ElectricCar{
    public Modelx(String make, String model, double price, int year, int range) {
        super(make, model, price, year, range);

    }
    /*
    ERROR below, because charge is final method. cannot be overridden
     */
}

package OfficeHours.replit_june;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    public boolean isPersian = true;

    public Carpet() {
        this.length = 300;
        this.width = 300;
        this.unitPrice = 0;
        this.totalPrice = 200;
        this.isPersian = false;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.length = length;
        this.width = width;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

        this.totalPrice = (width+length) * unitPrice;
        if(isPersian) {
            totalPrice +=200;
        }
    }
}

package OfficeHours.Practice_06_22_2021;

public class Walmart extends OnlineShopping{
    @Override
    public void cartView() {
        System.out.println("walmart");
    }

    @Override
    public boolean payForShipping(double price) {
        return false;
    }

    @Override
    public void buyItem() {
        System.out.println("walmart");
    }

    @Override
    public void returnItem() {
        System.out.println("walmart");
    }
}

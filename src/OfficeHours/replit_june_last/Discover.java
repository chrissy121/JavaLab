package OfficeHours.replit_june_last;

public class Discover extends CreditCard{

    public Discover(double apr, boolean cashback) {
        super (11.99, true);
    }

    @Override
    public void useCard() {
        System.out.println("Using Discover card");
    }

    @Override
    public void payBalance(double balance) {
        System.out.println("Paying $givenBalance from $cardBalance");
    }
}

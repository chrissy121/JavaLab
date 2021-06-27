package OfficeHours.replit_june_last;

public class CapitalOne extends CreditCard{

    public CapitalOne(double apr, boolean cashback) {
        super(14.35, false);
    }

    @Override
    public void useCard(){
        System.out.println("Using Capital One card");
    }

    @Override
    public void payBalance(double balance){
        System.out.println("Paying $givenBalance from $cardBalance");
    }
}

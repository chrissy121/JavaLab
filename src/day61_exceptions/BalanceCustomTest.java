package day61_exceptions;

public class BalanceCustomTest {
    public static void main(String[] args) {
        double balance = 400.0;
        double itemPrice = 500.0;
        System.out.println("I have $" + balance + " and purchasing item for $" + itemPrice);

        if (itemPrice>balance) {
            throw new InsufficientBalanceException("Transaction declined. Not enough funds");
        }
        System.out.println("Item successfully purchased");
    }
}

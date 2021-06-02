package day49_static;

public class BankAccount {
    static double balance = 500.0;
    String user;

    public void spend(double amount) {
        balance -=amount;
        System.out.println(user + " is spending $ " + amount);

    }
    public void showBalance() {
        System.out.println("Current balance = $" + balance);
    }

}

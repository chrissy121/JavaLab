package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {

        double bonus = 0.0;
        double salesAmount = 5000.55;
        if (salesAmount <= 2000) {
            System.out.println("Good job, You qualified for bonus!");
            bonus = 50;
        } else {
            System.out.println("Great job, You are qualified for full bonus");
            bonus = 100;
        }
        System.out.println("Your bonus for " + salesAmount + " is $" + bonus);
    }
}

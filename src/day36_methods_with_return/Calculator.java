package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Addition = "+ add(3.7, 5.5));
        System.out.println("Subtraction = "+ minus(3.7, 5.5));
        System.out.println("Multiplication = "+ multiple(3.7, 5.5));
        System.out.println("Division = "+ divide(3.7, 5.5));


        double d1 = 234.3;
        double d2 = 321.5;
        double result = Calculator.minus(d1, d2);
        System.out.println("result = " + result);


    }

    public static double add(double num1, double num2) {
        double sum = num1+num2;
        return sum;
    }
    public static double minus(double num1, double num2) {
        double minus = num1-num2;
        return minus;
    }
    public static double multiple(double num1, double num2) {
        double multi = num1*num2;
        return multi;
    }
    public static double divide(double num1, double num2) {
        double div = num1+num2;
        return div;
    }

}

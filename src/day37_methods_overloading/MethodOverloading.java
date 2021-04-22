package day37_methods_overloading;


public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading.sum(4, 54);
        sum(5.4, 2.34);
        sum(3, 5, 67);
        sum("Hello", "World");
        sum((int)3.2, 4, 5);

    }


    public static void sum(int num1, int num2) {
        System.out.println("sum (int num1, int num2)");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void sum(double num1, double num2) {

        System.out.println("sum (double, double)");
        System.out.println("Result = " + (num1 + num2));

    }

    public static void sum(int num1, int num2, int num3) {
        System.out.println("sum (int, int, int)");
        System.out.println("Result = " + (num1 + num2 + num3));
    }

    public static void sum(String num1, String num2) {
        System.out.println("sum (string, string)");
        System.out.println("Result = " + (num1 + num2));
    }

}

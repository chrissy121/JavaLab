package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {

        System.out.println(10 == 10);
        System.out.println(20 > 500);
        System.out.println(20 < 500);
        System.out.println(20 >= 500);
        System.out.println(20 <= 500);
        System.out.println(20 != 500);
        System.out.println("*******************");

        int a = 100;
        int b = 200;

        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);

        boolean result = 5 == 5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);

        result = 10 >= 10;
        System.out.println("result = " + result);

        result = 123 < 124;
        System.out.println("result = " + result);

        result = 2!=2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city != "Herndon");

        String name = "Bolor";
        boolean checkName = name =="Bolor";
        System.out.println("checkName = " + checkName);

        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);

    }
}

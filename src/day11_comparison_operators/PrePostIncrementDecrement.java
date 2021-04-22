package day11_comparison_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
            int num1 = 1;
            num1++;
            ++num1;
        System.out.println("num1 = " + num1);

        int num2 = 5;
        num2--;
        --num2;
        System.out.println("num2 = " + num2);

        // PRE-INCREMENT
        int num3 = 4;
        int num4 = ++num3;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        //POST-INCREMENT
        int num5 = 4;
        int num6 = num5++;
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

        int cars = 5;
        System.out.println(++cars);

        int sedans = 10;
        System.out.println(sedans++);
        System.out.println("sedans = " + sedans);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }
}

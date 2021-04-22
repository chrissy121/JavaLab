package test01_test;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int n1=20;
        int n2=10;

        int sum=n1+n2;
        int substraction=n1-n2;
        int multiplication=n1*n2;
        int division=n1/n2;
        int remainder=n1%n2;

        System.out.println(
                "Niilber="+sum+
                ", Substraction="+substraction+
                ", Multiplication="+multiplication+
                ", Division="+division+
                ", Remainder="+remainder);

        double d=10.5;
        int i=3;
        double j=d*i;
        System.out.println(j);

        double d2=3.4;
        double d3=d-d2;
        System.out.println(d3);

    }
}

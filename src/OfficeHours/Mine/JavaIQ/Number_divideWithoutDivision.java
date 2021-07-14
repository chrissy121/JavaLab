package OfficeHours.Mine.JavaIQ;

public class Number_divideWithoutDivision {
    public static void main(String[] args) {

        System.out.println(divideWithoutOperator(15, 3));
    }
    public static int divideWithoutOperator(int num1,int num2) {

        int div = 0;
        while(num1>=num2) {

            num1 = num1-num2;
            div ++;

        }
        return div;
    }
}

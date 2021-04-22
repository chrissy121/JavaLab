package day14_multi_branch_if_statements;

public class CalculatorV1 {
    public static void main(String[] args) {
        double num1 = 15.4;
        double num2 = 3.6;
        char oper = '#';

        if (oper == '+') {
            System.out.println(num1 + num2);
        } else if (oper == '-') {
            System.out.println(num1 - num2);
        } else if (oper == '*') {
            System.out.println(num1 * num2);
        } else if (oper == '/') {
            System.out.println(num1 / num2);
        }
        else {
            System.out.println(oper + " - invalid operator");
        }
    }
}
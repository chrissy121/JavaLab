package OfficeHours.String_Practice2;
/*
[Operators]

Analyze the following without intellij. Calculate the output step by step

    int a = 5; // 5
    int b = a++ + a-- + a * 2 + a + ++a;

What is the value of a and b?
 */

public class OperatorsMySelf {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ +a-- + a * 2 + a + ++a;
        //
        System.out.println("Value: a = " + a);
        System.out.println("Value: b = " + b);
    }
}

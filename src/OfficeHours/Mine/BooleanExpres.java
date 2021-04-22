package OfficeHours.Mine;
/*
[Boolean expressions, operators]

Create a program that will accept a number and it will print if it is evenly divisible by 2, 3, and 5

Ex:
number = 65

Output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true


 */
public class BooleanExpres {
    public static void main(String[] args) {

        int num = 65;
        boolean b = num % 2==0;
        boolean b1 = num % 3==0;
        boolean b2 = num % 5==0;


        System.out.println(num + " is divisible by 2:" + b );
        System.out.println(num + " is divisible by 3:" + b1 );
        System.out.println(num + " is divisible by 5:" + b2 );






    }

}

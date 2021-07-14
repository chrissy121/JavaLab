package OfficeHours.Mine.JavaIQ;

public class Number_Divisible3_5_15 {
    public static void main(String[] args) {
        System.out.println(isDivisible3515(30));
        isDivisible3_5_15(100);
    }
    public static boolean isDivisible3515(int number) {

        return ((number % 15==0) && (number%3==0) && (number%5==0));

    }

    public static void isDivisible3_5_15(int num) {
        String divisibleBy3 = "";
        String divisibleBy5 = "";
        String divisibleBy15 = "";


        int[] myArr = new int[num];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i+1;
        }
        for (int each: myArr ) {
            if(each % 15 == 0 ) {
                divisibleBy15 += each+ " ";
            }
            if(each % 5 == 0 && each %15 !=0) {
                divisibleBy5 += each+ " ";
            }
            if(each % 3 == 0 && each % 15 !=0) {
                divisibleBy3 += each+ " ";
            }
        }
        System.out.println("divisible by 3: " + divisibleBy3);
        System.out.println("divisible by 5: " + divisibleBy5);
        System.out.println("divisible by 15: " + divisibleBy15);
    }


}

package OfficeHours.Mine.JavaIQ;
/*
 return the sum of all integers found in the parameter String
 */


public class ReturnInteger {
    public static void main(String[] args) {
        String word = "T0d4y 1s v3ry h0t333";

        System.out.println(sumOfReturnInteger(word));

    }
    public static int sumOfReturnInteger(String str) {
        int sum = 0;

//        str.replaceAll(" ", "");

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.charAt(i)+ "");
            }
        }
        return sum;
    }
}

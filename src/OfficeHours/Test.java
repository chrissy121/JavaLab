package OfficeHours;

public class Test {
    public static void main(String[] args) {

        System.out.println(firstChar("Bolormaa"));



    }
    public static String firstChar(String str) {
        String result="";

        result = str.substring(0, 3);

        return result;
    }



}

package OfficeHours.Mine.JavaIQ;

import java.util.Arrays;

/*
 Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    sort the individual string and append them back together
        Ex:
            Input: "DC501GCCCA098911"
            Output: "CD015ACCCG011899"
 */
public class String_SortLettersAndNumbers {
    public static void main(String[] args) {
        String word = "DC501GCCCA098911";
      //  System.out.println(sortLettersNumbers(word));
        System.out.println(second(word));

    }
    //===================================================================
    public static String sortLettersNumbers(String str) {

        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            temp += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    temp += ",";
                }
            }
//--------------------------------------------------------------------------------
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    temp += ",";
                }
            }
        }
//----------------------------------------------------------------------------------
            String[] myArr = temp.split(",");
            str = "";
//--------------------------------------------------------------------------------
            for (String each : myArr) {
                char[] chars = each.toCharArray();
                Arrays.sort(chars);
                for (char eachChar : chars) {
                    str += "" + eachChar;
                }
            }
        return str;
    }
    public static String second(String str) {
        String newStr = "";
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
        for (char each: charArr) {
            newStr += ""+each;
        }

        return newStr;
    }






}

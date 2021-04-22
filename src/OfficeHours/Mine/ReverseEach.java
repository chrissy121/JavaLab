package OfficeHours.Mine;

import java.util.Arrays;

public class ReverseEach {
    public static void main(String[] args) {
        String sentence = "It started to snow in Chicago";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String result = "";

        for (int i = 0;  i< words.length ; i++) {
            result += " ";
            for (int j = words[i].length()-1; j >= 0; j--) {
                result += words[i].charAt(j);

            }
        }
        String [] finalArray = result.trim().split(" ");
        System.out.println(Arrays.toString(finalArray));

    }
}

package OfficeHours.Mine.LoopPractice3;

public class ReverseSecondWord {
    public static void main(String[] args) {
        /*
        Reverse only second wordGiven a String with three words separated by spaces.
        Reverse only the second word and return the modified String
        Ex:I love java
        I evol java
         */

        String sentence = "I love java";
        sentence = sentence.trim();
        int index = sentence.indexOf(" ");
        String word1 = sentence.substring(0, index+1);

        sentence = sentence.substring(index+1).trim();
        index = sentence.indexOf(" ");
        String word2= sentence.substring(0, index);
        String word2Reverse = "";

        for (int i = word2.length()-1; i >= 0; i--) {
            word2Reverse += word2.charAt(i);
        }

        String word3 = sentence.substring(index);

        System.out.println(word1+word2Reverse+word3);
    }
}

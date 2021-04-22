package OfficeHours.Mine.LoopPractice3;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word = "AAABCCDEEF";

        int max = 0;
        String dup = "";
        String result = ""; // solution


        for (int i = 0; i < word.length(); i++) {
            char findThisChar = word.charAt(i); // look for this character


            // count 'findThisChar' in 'word'
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (findThisChar == word.charAt(j)) {
                    count++;
                }
            }

            // check and add into solution
            if (count > 1) {
                if (!result.contains("" + findThisChar)) {
                    result += findThisChar;
                }
            }


        }

        System.out.println(result);

    }
}

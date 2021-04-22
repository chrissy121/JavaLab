package OfficeHours.Mine;

public class UniqueChars {
        public static void main(String[] args) {
            String word = "AAABCCDEEF";

            String result = ""; // solution


            for (int i = 0; i < word.length(); i++) {
                char findThisChar = word.charAt(i); // look for this character

                // check and add into solution
                if (result.contains("" + findThisChar)) {
                    continue;
                }

                // count 'findThisChar' in 'word'
                int count = 0;
                for (int j = 0; j < word.length(); j++)  {
                    if (findThisChar == word.charAt(j)) {
                        count++;
                    }
                }

                if (count != 1) {
                    result += findThisChar;
                }
            }
            System.out.println(result);
        }
}

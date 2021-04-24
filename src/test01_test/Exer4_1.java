package test01_test;

public class Exer4_1 {

    public static void main(String[] args) {


        System.out.println(str("AAABBCCDEF"));

    }
    public static String str(String word) {
        String newStr = "";

        for (int i=0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }

            if(count==1) {
                newStr += word.charAt(i)+"";
            }
        }
        return  newStr;
    }
}

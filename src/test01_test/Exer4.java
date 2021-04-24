package test01_test;

public class Exer4 {
    public static void main(String[] args) {


        System.out.println(str("AAABBCCDEF"));

    }
    public static String str(String word) {
       String newStr = "";

        for (int i=0; i < word.length(); i++) {
            if(!newStr.contains(word.charAt(i)+"")) {
                newStr += word.charAt(i)+"";
            }
        }
        return  newStr;
    }
}

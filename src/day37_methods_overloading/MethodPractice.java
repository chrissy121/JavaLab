package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {

        System.out.println(repeatString("me", 7, '|'));
        System.out.println(repeatString("love ", 5, '*'));
    }

    public static String repeatString (String words, int times, char ch) {
     String str = "";
        for (int i=1; i<=times; i++) {

            if (i == times) {
                str += words;
            } else {
                str += words + ch;
            }

        }
        return str ;
    }
}

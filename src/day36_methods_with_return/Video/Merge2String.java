package day36_methods_with_return.Video;

public class Merge2String {
    public static void main(String[] args) {

        String a = "Cybertek";
        String b = "Java1234567";

        String newStr = "";

        if (a.length() >= b.length()) {

            for (int i = 0; i < b.length(); i++) {
                newStr += "" + a.charAt(i) + b.charAt(i);
            }
            int l = a.length() - b.length();
            System.out.println(newStr + a.substring(l));

        } else {
            for (int i = 0; i < a.length(); i++) {
                newStr += "" + b.charAt(i) + a.charAt(i);
            }
            int l = b.length() - a.length();
            System.out.println(newStr + b.substring(l));

        }

    }
}

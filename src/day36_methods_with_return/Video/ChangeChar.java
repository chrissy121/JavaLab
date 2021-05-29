package day36_methods_with_return.Video;

public class ChangeChar {
    public static void main(String[] args) {

        System.out.println(frontBack("Bolor"));

    }

        public static String frontBack(String str) {
            if(str.length() == 0) { return "";}
            if(str.length() == 1) {return str;}
            String newStr = "";
            if(str.length() > 1) {
            int l = str.length();
               newStr = str.charAt(l-1)+str.substring(1, l-1)+str.charAt(0);
            }
            return newStr;
        }

}

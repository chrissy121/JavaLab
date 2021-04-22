package OfficeHours.Mine;

public class StringExam4 {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "mouse";
        String str3 = "apple";
        int l = 0;
        String maxWord = "";
        if (str1.contains("a"))  {
              l = str1.length();
              maxWord = str1;
        }
        if (str2.contains("a")) {
            if ( str2.length() >= l ) {
                l = str2.length();
                maxWord = str2;
            }
        }
        if (str3.contains("a")) {
            if (str3.length() >= l  ) {
                l = str3.length();
                maxWord = str3;
            }
        }
        System.out.println(maxWord);
    }
}

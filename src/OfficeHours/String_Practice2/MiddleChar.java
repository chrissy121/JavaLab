package OfficeHours.String_Practice2;

public class MiddleChar {
    public static void main(String[] args) {
        String str = "epe";
        int p = str.length()/2;
        if (str.length() % 2 == 0) {
            System.out.println(str.substring(p-1, p+1));
        } else {
            System.out.println(str.substring(p, p+1));
        }

    }
}

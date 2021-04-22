package OfficeHours.String_Practice2;

public class MoveFirstWord {
    public static void main(String[] args) {
        String str = "Java is fun language";
        String str1 = str.substring(0, str.indexOf(" "));
        System.out.println((str.substring(str.indexOf(" ")+1))+ " " + str1) ;

    }
}

package OfficeHours.Mine;

public class MoveFirstWord {
    public static void main(String[] args) {
        String str = "Java is fun";

        int space = str.trim().indexOf(" ");
        String firstWord = str.substring(0, space);
        System.out.println(str.substring(space+1)+ " "+ firstWord);
    }
}

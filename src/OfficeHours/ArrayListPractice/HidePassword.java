package OfficeHours.ArrayListPractice;

import java.util.ArrayList;

public class HidePassword {
    public static void main(String[] args) {
        String[] passWord = {"one" , "hi", "hold"};
        ArrayList<String> secret = new ArrayList<>();

        for (String each : passWord) {
            secret.add(each.replaceAll("\\w","*"));
        }

        System.out.println(secret);
    }
}

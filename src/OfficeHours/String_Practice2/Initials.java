package OfficeHours.String_Practice2;

import java.sql.SQLOutput;

public class Initials {
    public static void main(String[] args) {
        String first = "Bolormaa";
        String last =  "Baasankhuu";

        String ini = first.substring(0,1).toUpperCase()+last.substring(0, 1).toUpperCase();

        System.out.println("Your initials are " + ini);
    }
}

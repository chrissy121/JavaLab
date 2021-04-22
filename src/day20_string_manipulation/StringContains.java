package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o"));  //true

        // if company contains space, print
        if (company.contains(" ")) {
            System.out.println("Multiple words company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains(" | ")) {
            System.out.println("Title checked");
        } else {
            System.out.println("unchecked");
        }
        String firstName = "ahmed";
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("first name contains both a and e at same time");
        } else {
            System.out.println("not contain");
        }
        firstName = "Nadir";

        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("First name contains a OR i");
        } else {
            System.out.println("False");
        }
        String email = "crys121@gmail.com";
        if (email.contains(".com") && email.contains("@")) {
            System.out.println("email address is correct");
        } else {
            System.out.println("wrong email");
        }
        if (email.toLowerCase().contains("d")) {
            System.out.println("d is present");
        } else {
            System.out.println("d is not present");
        }
    }
}

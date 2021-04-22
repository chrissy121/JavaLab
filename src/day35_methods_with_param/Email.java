package day35_methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
     buildEmail("saim", "cybertek");
     buildEmail("Bolormaa Baasankhuu", "verizon");
    }

    public static void buildEmail(String name, String domain) {
        name = name.replace(" ", "").toLowerCase();
        domain = domain.toLowerCase();
        String email = name + "@" +domain + ".com";
        System.out.println(email);
    }
}

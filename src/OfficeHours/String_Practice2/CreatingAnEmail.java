package OfficeHours.String_Practice2;

public class CreatingAnEmail {
    public static void main(String[] args) {
        String str1 = "Bolormaa";
        String str2 = "Secret";
        String str3 = "@cybertek.com";

        if (str1.length() >= 6 && str2.length() >= 6) {

            String creating = str1.substring(0, 4) + str2.substring(str2.length() - 3).toLowerCase();

            System.out.println(creating + str3);
        } else {
            System.out.println("Invalid data");
        }

    }
}

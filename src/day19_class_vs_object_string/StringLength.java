package day19_class_vs_object_string;

public class StringLength {
    public static void main(String[] args) {

        String name = "Bolormaa";
        System.out.println(name.length());
        System.out.println(name + "-" + name.length());
        int count = name.length();
        System.out.println("count = " + count);
        String password = "abc123";// at least 6 chacater
        if (password.length() >= 6) {
            System.out.println("valid password");
        } else {
            System.out.println("not valid password");
        }

        String countryCode = "usa";
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}

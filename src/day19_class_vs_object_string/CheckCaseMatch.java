package day19_class_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "UK";
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("pass - case is correct");
        } else {
            System.out.println("false - case is incorrect");
        }
    }
}

package OfficeHours.Mine;

public class StringExample {
    public static void main(String[] args) {
        String fullName = "james bond";
        String lastName = "bond";

        if (fullName.contains(lastName)) {
            System.out.println("Same last name");
        } else {
            System.out.println("Not the same last name");
        }
    }
}

package OfficeHours.Mine;

public class StringExam3 {
    public static void main(String[] args) {
        String userName = "chrissy";
        String passWord = "12UB34_56*";
        if (passWord.length() <= 5) {
            System.out.println("Password cannot be less than 5 characters");
        } else {
            System.out.println("Valid password");
        }
        if (passWord.contains(userName)){
            System.out.println("Invalid password, username should not be in it ");
            if (passWord.contains("password")) {
                System.out.println("Please change password");
            }
        }
    }
}

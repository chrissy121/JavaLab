package OfficeHours.Mine;

public class AccountNumber {
    public static void main(String[] args) {

        String accNumber = "2345678";

        if ( accNumber.startsWith("2") && accNumber.length()==7) {
                System.out.println("Valid 7 digit account number");
        } else {
                System.out.println("Invalid 7 digit account number");
        }
        if ( accNumber.startsWith("5") && accNumber.length()==10 ) {
            System.out.println("Valid 5 digit account number");
        } else {
            System.out.println("Invalid 5 digit account number");
        }
        if ( !accNumber.startsWith("2") && !accNumber.startsWith("5") ) {
            System.out.println("Invalid account number");
        }
    }
}

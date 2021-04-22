package OfficeHours.Mine;

public class Ternary {
    public static void main(String[] args) {
        double salary= 90000.0;
        int creditScore = 700;
        String loan = ((salary>= 60000) && (creditScore >= 650)) ? "Loan Approved" : "Loan Denied";
        System.out.println(loan);


        String sport = "Tennis";
        int fee = (sport.equals("Soccer") || sport.equals("Tennis")) ? 100 : 50;
        System.out.println(fee);
    }
}

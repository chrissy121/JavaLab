package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numBedRoom = 2;

        int price = 0;
        System.out.println("###### WELCOME TO ADAIR APARTMENT ######");
        switch (numBedRoom) {
            case 0:
                System.out.println("Studio apartment selected.");
                price = 1_454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected.");
                price = 1_725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected.");
                price = 2_899;
                break;
            default:
                System.out.println("5 bedroom currentle unavailable");
        }
        System.out.println("Starting price is: $"+ price);

        String result;
        int score = 90;
        if (score > 90) {
            result = "pass";
        } else {
            result = "fail";
        }

        boolean isGreen = true;
        String action;
        if (isGreen) {
            action = "can drive";
        } else {
            action = "stop";
        }
    }
}

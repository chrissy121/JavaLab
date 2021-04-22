package OfficeHours.Mine;

public class MorningNight {
    public static void main(String[] args) {
        int hour = 22;

        if (hour >= 12 && hour <=24) {
            String name = (hour >= 0 && hour <= 11) ? "Morning " : "Night ";
            System.out.println(name);
        } else {
            System.out.println("Invalid number");
        }
    }
}

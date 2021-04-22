package OfficeHours.Mine;

public class Test {
    public static void main(String[] args) {

        int year = 1;
        int growth = 1;
        int size = 1;
        while (year <= 10) {
            System.out.println("year " + year + "-growth " + growth + " cm");
            System.out.println("tree size: " + size + "cm");
            year++;
            size += 1;
            if (year >= 4 && year <= 10) {

                growth = 2;
                size += 1;
            }
        }

    }
}

package OfficeHours.Practice_03_23_2021;

public class SalaryCalculator {

    public static void main(String[] args) {
        int hourlyRate = 10;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        boolean hourlyRateIsValid = hourlyRate > 0;
        boolean weeklyHoursAreValid = weeklyHours > 0 && weeklyHours <= 65;
        boolean numberOfWeeksAreValid = numberOfWeeks > 0 && numberOfWeeks <= 52;

        if (hourlyRateIsValid && weeklyHoursAreValid && numberOfWeeksAreValid) {
            System.out.println("Salary is:" + (hourlyRate * weeklyHours * numberOfWeeks));
        }
    }
}

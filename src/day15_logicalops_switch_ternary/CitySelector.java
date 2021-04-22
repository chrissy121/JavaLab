package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city= "Fairfax";

        if ((city.equals("Fairfax") || city.equals("Los Angeles"))) {
            System.out.println("Willing to relocate to " +  city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "Gurhan";

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Some class with " + teacher);
        }

        String companyName= "UuganTech";
        double salary = 110_000.0;
        if (companyName.equals("Google") || salary>=100_000) {
            System.out.println("Accepting offer from " + companyName + " " + salary);
        } else {
            System.out.println("Rejecting offer form" + companyName);
        }



    }
}

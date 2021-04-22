package OfficeHours.Practice_03_02_2021;
/*
Make a class Zoo
make a main method

Create variables and give some values

    - For this one, pick which datatype you think is best for each variable
    - name, founded date, starting time, closing time, open on holidays, has aquarium section, number of big cats, number of hoofed animals, number of reptiles, number of birds, number of primates, number of employees, ticket cost for adults, ticket cost for under 13, park rules,
    - Make a brochure of the zoo's information.

 */
public class Zoo {
    public static void main(String[] args) {
        String name = "Roer's Zoofari";
        String foundedDate = "March 3, 1975";
        String startingTime = "10.00am", closingTime = " 4.00pm";
        boolean openOnHolidays = true;
        boolean hasAquariumSection = false;
        int numberOfBigCats = 10, numberOfHoofedAnimals = 120, numberOfReptiles = 110, numberOfBirds = 230, numberOfPrimates = 24;
        int numberOfEmployees = 70;
        double ticketCostAdults = 25, ticketCostUnder13 = 15;
        String parkRules = "Every guest can experience 2 laps in the Safari.\n" +
                "Each lap takes approximately 15-20 minutes.\n" +
                " Expect longer times during busier days (weekends).";
        System.out.println("************************************************");
        System.out.println("     WELCOME TO:  " + name );
        System.out.println("**********************************************");
        System.out.println("  The ROER'S ZOOFARI FOUNDED " + foundedDate );
        System.out.println("  WORKING HOUR:  " + startingTime + "-" + closingTime );
        System.out.println("  WE OPEN ON HOLIDAY:  " + openOnHolidays );
        System.out.println("  AQUARIUM SECTION:  " + hasAquariumSection);
        System.out.println("************************************************");
        System.out.println("YOU CAN SEE " + numberOfBigCats+ " BIGCATS, "+
                numberOfHoofedAnimals+ " HOOFED ANIMALS, \n" + numberOfReptiles +
                " REPTILES " + numberOfBirds + " BIRDS " + numberOfPrimates + " PRIMATES AT ROER'S ZOOFARI.");
        System.out.println("");
        System.out.println("Adult PRICE: $" + ticketCostAdults);
        System.out.println("UNDER13 PRICE: $" + ticketCostUnder13);
        System.out.println("WE HAVE VERY POLITE " + numberOfEmployees + " EMPLOYEES.");
        System.out.println("******************************************************");
        System.out.println("Let's Self Drive Safari & Walking Tour Guest ");
        System.out.println("******************************************************");


    }
}

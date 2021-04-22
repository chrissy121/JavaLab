package OfficeHours.String_Practice2;
/*
create a class named Apartment
create a main method

    Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not,
        has a pool, length of lease, total number of residents in building, phone number of owner,
        is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning,
        number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)
 */
public class Apartment {
    public static void main(String[] args) {

        String address = "2151 Astoria cir Herndon VA 20170";
        String nameOfOwner = "Harbor Group";
        int numberOfUnits = 2500;
        String averageSizeOfEachUnit = "1500 Sq/m";
        double monthlyRentAmount = 2000;
        byte numOfWasher = 1, numOfDrier = 1;
        boolean allowPets = true;
        boolean hasPool = true;
        String lengthOfLease = "12 mounth ";
        int totalNumberOfResidents = 5000;
        String phoneNumberOfOwner = " 1-844-759-7732 ";
        boolean isNearGasStation = true;
        byte numberOfFloors = 3;
        boolean hasBasementAvailableUnitsForRent = false;
        boolean hasAirConditioning = true;
        int numberOfParkingSpaces = 6000;
        boolean hasWheelChairAccess = false;
        char numberOfReviewStars = '4';

        double monthlyRentAfter3Years = (monthlyRentAmount - monthlyRentAmount * 0.1);
        double monthlyRentAfter6Years = (monthlyRentAmount - monthlyRentAmount * 0.2);
        int averageNumOfResidentPerUnit = totalNumberOfResidents / numberOfUnits;
        int averageNumberOfParkingSpotsPerUnit = numberOfParkingSpaces / numberOfUnits;
        int averageNumberOfUnitsPerFloor =  (numberOfUnits / numberOfFloors );

        System.out.println("Apartment address: \t\t\t\t\t\t" + address);
        System.out.println("Name of Owner: \t\t\t\t\t\t\t" + nameOfOwner);
        System.out.println("Number of Unit: \t\t\t\t\t\t" + numberOfUnits);
        System.out.println("Average size of each unit:\t\t\t\t" + averageSizeOfEachUnit);
        System.out.println("Monthly Rent Amount:\t\t\t\t\t$" + monthlyRentAmount);
        System.out.println("Number of washer - " + numOfWasher + ", Number of drier - " + numOfDrier);
        System.out.println("Allow Pets: \t\t\t\t\t\t\t" + allowPets );
        System.out.println("Has a pool: \t\t\t\t\t\t\t" + hasPool);
        System.out.println("Length of lease:\t\t\t\t\t\t" + lengthOfLease);
        System.out.println("Phone number of owner: \t\t\t\t\t" + "(" +phoneNumberOfOwner+")");
        System.out.println("Is near gas station:\t\t\t\t\t" + isNearGasStation);
        System.out.println("Has basement available units for rent: \t" + hasBasementAvailableUnitsForRent);
        System.out.println("Has air conditioning:\t\t\t\t\t" + hasAirConditioning);
        System.out.println("Has wheel chair access:\t\t\t\t\t" + hasWheelChairAccess);
        System.out.println("Number of review stars:\t\t\t\t\t " + numberOfReviewStars);

        System.out.println("Monthly rent after 3 years: \t\t\t $" + monthlyRentAfter3Years);
        System.out.println("Monthly rent after 6 years: \t\t\t $" + monthlyRentAfter6Years);
        System.out.println("Average number of resident per unit: \t " + averageNumOfResidentPerUnit);
        System.out.println("Average number of parking spot per unit: " + averageNumberOfParkingSpotsPerUnit);
        System.out.println("Average number of units per floor: \t\t " + averageNumberOfUnitsPerFloor);

    }
}

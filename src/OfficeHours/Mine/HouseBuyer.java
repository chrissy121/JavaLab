package OfficeHours.Mine;

public class HouseBuyer {
    public static void main(String[] args) {
        String neighborhoodName= "Hills";
        int housePrice;
        float rateSchool;
        boolean isGatedCommunity = true, allowPets = true;

        switch (neighborhoodName){
            case "Hills":
                    housePrice = 89_000;
                    rateSchool = 4.0f;
                    isGatedCommunity = false;
                    allowPets = true;
                    break;
            case "Oaks":
                housePrice = 75_000;
                rateSchool = 3.5f;
                isGatedCommunity = false;
                allowPets = true;
                break;
            case "Highland":
                housePrice = 150_000;
                rateSchool = 4.5f;
                isGatedCommunity = true;
                allowPets = false;
                break;

            case "Canyon":
                housePrice = 201_000;
                rateSchool = 4.8f;
                isGatedCommunity = true;
                allowPets = true;
                break;
            default :
                housePrice = 0;
                rateSchool = 0.0f;
                break;
             }
        System.out.println("Name= " + neighborhoodName);
        System.out.println("House price $" + housePrice);
        System.out.println("Rating of school districts near by(out of 5) " + rateSchool);
        System.out.println("It is a gated community? " + isGatedCommunity);
        System.out.println("Allow pets " + allowPets);
    }
}

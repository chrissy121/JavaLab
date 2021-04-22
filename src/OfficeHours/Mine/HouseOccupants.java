package OfficeHours.Mine;

public class HouseOccupants {
    public static void main(String[] args) {
        /*
        Given a house type (String) print out the number of max occupants (int)
 Tree house: 1
 Mobile home: 2
 Apartment: 4
 Town house: 6
 Villa: 8
 Mansion: 10
-> Try to use variables instead of printing multiple time
         */
        String houseType = "Mobile home";
        int number = 0 ;
    switch (houseType) {
        case "Tree house" :
            number = 1;
            break;
        case "Mobile home" :
            number = 2;
            break;
        case "Apartment" :
            number = 4;
            break;
        case "Town house" :
            number = 6;
            break;
        case "Villa" :
            number = 8;
            break;
        case "Mansion" :
            number = 10;
            break;
    }
        System.out.print( houseType + ":" + number);
    }
}

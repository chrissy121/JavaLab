package day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 20_25;
        if ( year == 2020) {
            System.out.println("Covid19 pandemic year");
            System.out.println("Wear mask and keep distance");
        }
        System.out.println("Keep coding java");

        String country = "CANADA";
        if(country.equals("USA")){
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Pennsylvania ave");
        }
        System.out.println("Welcome to " + country );
        int day = 2;
        if (day==1) {
            System.out.println("Monday");
        } else if (day==2){
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Java day");
        }
    }
}

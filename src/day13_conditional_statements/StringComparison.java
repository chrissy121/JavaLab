package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if(city.equals("Herndon")) {
            System.out.println("Yes, I live in " + city);
        }else{
            System.out.println("Sorry, I do not live in " + city);
        }

        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("Lets go out and code java!");
        }else{
            System.out.println("Bad weather lets continue java");
        }
    }
}

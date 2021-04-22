package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {

        String weather = "Windy";

        if (weather.equals("Sunny")) {
            System.out.println(weather + " - go to park, hiking and code java.");
        } else if (weather.equals("Rainy")){
            System.out.println(weather + " - stay home, drink tea and code java.");
        } else if(weather.equals ("Snowy")) {
            System.out.println(weather + " - clean the car then build snowman, drink hot chocolate and code java.");
        } else if(weather.equals("Windy")) {
            System.out.println(weather + " - get ready for power loss, fly a kite, and code java.");
        } else {
            System.out.println("Just keep coding java.");
        }
    }
}

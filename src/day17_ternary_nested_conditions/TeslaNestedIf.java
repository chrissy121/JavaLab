package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {

        char model = 'S';
        String trim = "long range";
        if (model=='S'){

            if(trim.equals("long range")){
                System.out.println("cheap one 412mi\n" +
                        "Range (Est.)\n" +
                        "155mph\n" +
                        "Top Speed\n" +
                        "3.1sec");
            } else if (trim.equals("plaid")) {
                System.out.println("390mi\n" +
                        "Range (Est.)\n" +
                        "200mph\n" +
                        "Top Speed\n" +
                        "1.99sec");
            } else if(trim.equals("plaid+")){
                System.out.println("520+mi\n" +
                        "Range (Est.)\n" +
                        "200mph\n" +
                        "Top Speed\n" +
                        "<1.99sec");
            }
        }
    }
}

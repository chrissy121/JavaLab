package day15_logicalops_switch_ternary;

public class JabOfferSelector {
    public static void main(String[] args) {
        String location = "Virginia";
        Double salary = 105_000.0;
        boolean isRemote = true;
        boolean isBenefit = true;
        if (location.equals("Virginia") && (salary>=100000) && isRemote && isBenefit) {
            System.out.println("Sure, I will accept this offer");
        } else {
            System.out.println("Lets consider other Job offer or negotiate");
        }
    }
}

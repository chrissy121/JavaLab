package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
       String selection = "snack";
         String drink = "tea";
         String snack = "candy";

         if (selection.equals("drink")){
                   if (drink.equals("tea")){
                       System.out.println("tea is selected.");
                   } else if (drink.equals("coke")){
                       System.out.println("coke is selected.");
                   }
            } else if (selection.equals("snack")){
             if (snack.equals("chips")){
                 System.out.println("chips is selected.");
             } else if(snack.equals("candy")){
                 System.out.println("candy is selected.");
             }
         }
    }
}

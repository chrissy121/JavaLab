package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true, freeShipping = true;
        String itemname= "Wooden spoon";

       /* if (onSale && freeShipping) {

            System.out.println("Adding to cart -  " + itemname);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemname);
        }*/
        // add to cart onsale, freeshipping, wooden spoon bol avax

        if (onSale && freeShipping && itemname.equals("Wooden spoon")) {
            System.out.println("Adding to cart -  " + itemname);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemname);
        }


    }
}

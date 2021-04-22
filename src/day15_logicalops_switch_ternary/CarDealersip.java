package day15_logicalops_switch_ternary;

public class CarDealersip {
    public static void main(String[] args) {
        double budget = 5000.0;
        int carPrice = 4000;
        String model = "Toyota";

        if(carPrice <= budget && (model.equals("Toyota") || model.equals("Honda")))
        {
            System.out.println("Yes I decide to buy this " + model);
        } else {
            System.out.println("Not interested in model = " + model + ", price= " + carPrice);
        }


    }
}

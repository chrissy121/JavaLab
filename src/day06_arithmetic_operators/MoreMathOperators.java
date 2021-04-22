package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas = 431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;

        int totalCarsInParking = toyotas + hondas + vw + tesla + nissan + bmw;
        System.out.println("There are " + totalCarsInParking + " cars in parking lot.");
        System.out.println("---------------------------------------------------------");

        String pizza = "Hawaiian";
        int slices = 8;
        int famMember = 6;
        int slicesPerPerson = slices / famMember;
        System.out.println("There is " + slicesPerPerson + " slice per family member");
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, "
                + famMember + " member ate " + slicesPerPerson + " slice each.");


    }
}

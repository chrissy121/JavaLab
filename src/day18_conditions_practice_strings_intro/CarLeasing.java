package day18_conditions_practice_strings_intro;

public class CarLeasing {
    public static void main(String[] args) {
        String model = "A";
        String make = "Toyota";
        double leasePrice = 0.0;

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500;
            } else if (model.equals("A")) {
                leasePrice = 400;
            }
        }
        if (make.equals("Audi")) {
                if (model.equals("SQ5")) {
                    leasePrice = 552;
                } else if(model.equals("A3")) {
                    leasePrice = 412;
                }
        } else {
            System.out.println("Invalid make");
            return; //exit program
        }
        System.out.println("Make = " + make);
        System.out.println("Model = " + model);
        System.out.println("Lease price = " + leasePrice);

    }
}

package OfficeHours.Mine.OOP;

public class MyApplication {

    String name;
    double version;
    double size;

    public void call() {
        System.out.println("Loading the app : " + name +
                "\nThe version " + version +
                "\nThe size is: " + size + " MB");
        System.out.println("-----------------------");

    }
    public static String numbers(double num1, double num2) {
        return  ""+(num1-num2);
    }

}

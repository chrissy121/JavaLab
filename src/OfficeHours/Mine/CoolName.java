package OfficeHours.Mine;

public class CoolName {
    public static void main(String[] args) {
        String name = "azzaya";
        if(name.startsWith("a") || name.startsWith("z")) {
            System.out.println("Your name is cool");
        } else if (name.endsWith("m")) {
            System.out.println("Almost cool");
        } else {
            System.out.println("Sorry not a cool name");
        }
    }
}

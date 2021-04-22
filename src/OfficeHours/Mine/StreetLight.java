package OfficeHours.Mine;

public class StreetLight {
    public static void main(String[] args) {
        String light = "tdhstrf";
        switch(light) {
            case "Green":
                System.out.println("Go");
                break;
            case "Yellow":
                System.out.println("Slow down");
                break;
            case "Red":
                System.out.println("Stop");
                break;
            default:
                break;
        }
    }
}

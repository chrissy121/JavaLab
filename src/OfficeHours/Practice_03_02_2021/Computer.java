package OfficeHours.Practice_03_02_2021;

public class Computer {
    public static void main(String[] args) {
        String brand = "HP";
        String processor = "Intel(R) i5 ";
        String ramMemory = " 8GB ";
        String storageMemory = "238 GB ";
        boolean hasMonitor = true;
        boolean hasWifiCard = true;
        String description = "11th Gen Intel(R) Core(TM) i5-1135G7 @ 2.40GHz   2.42 GHz";
        int price= 700;
        String cpu = "2.42 GHz";
        String color = " Silver ";
        byte numberOfMonitors = 2;
        byte numberOfUsbSlots = 3;
        boolean hasUsb3 = true;

        System.out.println("Computer brand name is: " + brand);
        System.out.println("Processor type is:\t\t" + processor);
        System.out.println("RAM size is:\t\t\t" + ramMemory);
        System.out.println("Storage memory is: \t\t" + storageMemory);
        System.out.println("Has Monitor? \t\t\t" + hasMonitor);
        System.out.println("Has WiFi card?\t\t\t " + hasWifiCard);
        System.out.println("Computer description is: " + description);
        System.out.println("Computer price is: \t\t" + price + "$");
        System.out.println("CPU is: \t\t\t" + cpu);
        System.out.println("Computer color is: " + color);
        System.out.println("Number of Monitor:\t" + numberOfMonitors);
        System.out.println("Number of USB Slots: " + numberOfUsbSlots);
        System.out.println("Is Computer has USB 3.0: " + hasUsb3);



    }
}

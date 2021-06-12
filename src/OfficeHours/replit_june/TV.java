package OfficeHours.replit_june;

public class TV {
    int channel = 1;
    int volumeLevel = 0;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no args-constructor");
    }
    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public void channelUp() {
        channel++;
        if (channel>120) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }

    }
    public void channelDown() {
        channel--;
        if(channel<=0) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void volumeUp() {
       if(volumeLevel<8) {
           volumeLevel++;
       } else {
           System.out.println("ERROR: TV is either OFF or invalid Volume level");
       }
    }
    public void volumeDown() {
        if(volumeLevel>=0) {
            volumeLevel--;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void isOn(boolean on) {
        if(on) {
            System.out.println("TV is already ON");
        }
    }

    public void turnOn() {
        if(!on) {
            System.out.println("TV is already OFF");
        }
    }
    public void turnOff() {
        if(on) {
            System.out.println("TV is already ON");
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

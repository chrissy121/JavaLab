package day45_oop;

public class TrafficLight {
    String color;
    //this is read only method, displays
    public void showColor() {
        System.out.println("current color = " + color);
    }

    public void changeColor(String newColor) {

        if(newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("green") || newColor.equalsIgnoreCase("yellow")) {
            color = newColor;
        } else {
            System.out.println("ERROR: Wrong input " + newColor);
        }




    }
}

package day45_oop;

public class TrafficLightObject {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight myTrafficLight = new TrafficLight();
        //myTrafficLight.color = "red"; BAD way
        myTrafficLight.changeColor("red");
        //System.out.println(myTrafficLight.color); - DIRECT access to variable. Not recommended
        //call method to access the variable:
        myTrafficLight.showColor();

        myTrafficLight.changeColor("white");
        myTrafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("black");
        trafficLight2.showColor();

    }
}

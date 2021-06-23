package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Plain transport");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plain cost" + mile * 25.0 + " every mile" + mile);
    }

    @Override
    public void autoDrive() {
        System.out.println("Flying on auto driving");
    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard");
    }

    @Override
    public void bye() {
        System.out.println("Flying people from one city to another");
    }
}

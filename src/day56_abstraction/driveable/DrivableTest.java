package day56_abstraction.driveable;

import sun.plugin2.gluegen.runtime.StructAccessor;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.start();
        model3.hi();
        model3.transportPeople();
        model3.autoDrive();
        model3.cost(25);
        model3.stop();
        model3.bye();
        System.out.println("======================");

        Plane plane = new Plane();
        plane.start();
        plane.hi();
        plane.transportPeople();
        plane.autoDrive();
        plane.cost(25);
        plane.stop();
        plane.bye();

        //Polymorphism: will learn next class
        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();

        Transportation tp1 = new Plane();
        Transportation tp2 = new Tesla();
    }
}

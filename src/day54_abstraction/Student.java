package day54_abstraction;

/*
    => we add abstract keyword to a class to make it an abstract class.
    => we cannot create object of Student class - meaning:
    => Student student = new Student(); will show ERROR
    => what can we do with this Student class? We can extend this class by sub classes
    => Student class will Parent class for all other
 */

public abstract class Student {
    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }
    /*
    attendClass abstract method
     */



    public abstract void attendClass();
}



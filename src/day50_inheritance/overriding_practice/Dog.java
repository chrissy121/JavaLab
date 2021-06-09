package day50_inheritance.overriding_practice;

public class Dog extends Animal {

    public void run() {
        System.out.println("Dog can running...");
    }

    @Override
    public void speak() {
        System.out.println("Dog is barking ruff woof...");
    }
}

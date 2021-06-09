package day50_inheritance.overriding_practice;

public class Cat extends Animal{

    public void jump() {
        System.out.println("Cat can jumping...");
    }

    @Override
    public void speak() {
        System.out.println("Cat is speaking Meow...");
    }
}

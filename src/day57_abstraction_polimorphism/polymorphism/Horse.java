package day57_abstraction_polimorphism.polymorphism;

public class Horse extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Horse is saying <iiiinhooooo>");
    }
}

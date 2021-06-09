package day50_inheritance.overriding_practice;

public class AnimalObjects {
   public void AnimalObjects() {
       System.out.println("hvsdas");
   }
    public static void main(String[] args) {

        AnimalObjects a1 = new AnimalObjects();

       Animal animal = new Animal();
        animal.name = "Gray";
        animal.type = "Pitbul";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();


    }
}

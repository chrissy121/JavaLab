package day57_abstraction_polimorphism.abstract_class_vs_intetface;

public class Runner {
    public static void main(String[] args) {
        /*
        we cannot create obj (instantiate) neither of them
         */
        InterfaceA.staticMethodE("wooden spoon");
        ConcreteA.staticMethodC();

    }
}

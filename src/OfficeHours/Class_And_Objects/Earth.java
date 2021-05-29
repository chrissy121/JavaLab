package OfficeHours.Class_And_Objects;

public class Earth {
    public static void main(String[] args) {

        AnimalSpecies myAnimalSpecies = new AnimalSpecies();
        myAnimalSpecies.setInfo("Tarvaga", 67, 34);
        System.out.println(myAnimalSpecies);

        System.out.println(myAnimalSpecies.getName());
        System.out.println(myAnimalSpecies.getPopulation());
        System.out.println(myAnimalSpecies.getGrowthRate());

    }
}

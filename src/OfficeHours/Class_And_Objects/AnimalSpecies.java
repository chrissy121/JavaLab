package OfficeHours.Class_And_Objects;

public class AnimalSpecies {

    String name;
    int population;
    int growthRate;

    public void setInfo(String name1, int population1, int growthRate1) {
        name = name1;
        population = population1;
        growthRate = growthRate1;
    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population + " million " +
                ", growthRate=" + growthRate + "%" +
                '}';
    }
    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
    public int getGrowthRate() {
        return growthRate;
    }



}

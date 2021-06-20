package day55_abstraction.exercise;

public class Swimming extends Exercise{

    @Override
    public void perform() {
        System.out.println("Performing Swimming in a pool or ocean");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 11;
    }
}

package day55_abstraction.exercise;

public class AtTheGem {
    public static void main(String[] args) {

        Exercise exercise = new Running();
        //Exercise exercise = new Swimming();
        //Exercise exercise = new FreeWeight();

        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 min - calories = " + running.getCaloriesCount(30));

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 min - calories = " + running.getCaloriesCount(30));
    }
}

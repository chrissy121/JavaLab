package day55_abstraction.exercise;

public abstract class Exercise {

    public void start() {
        System.out.println("Warm up");
    }

    /*
     - abstract method  - method without body, just signature
     - purpose: letting sub classes implement/override their own way
     */

    public abstract void perform();

    /*
    another abstract method that concrete sub classes will override/implement
    @param minutes - how long is exercise id performed
    @return number of calories burned/used
     */
    public abstract int getCaloriesCount(int minutes);

}

package OfficeHours.Mine.shortVideojava;

public class Varargs {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int[] nums = {2, 3, 44};

        c.printAllArrayNumbers(nums);
        c.printAllNumbers(23, 23, 31,3, 42, 45, 55, 567);
    }

}

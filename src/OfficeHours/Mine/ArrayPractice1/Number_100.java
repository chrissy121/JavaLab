package OfficeHours.Mine.ArrayPractice1;

public class Number_100 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i=0; i<=99; i++) {
            numbers[i] = i+1;
            System.out.print(numbers[i]+ " ");
        }
    }
}

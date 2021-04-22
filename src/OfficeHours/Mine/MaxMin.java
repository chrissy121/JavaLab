package OfficeHours.Mine;

public class MaxMin {
    public static void main(String[] args) {


        int[] matrix = {12, 23, 34, 122, 2431};
        int max = matrix[0];
        int min = matrix[0];

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i] >= max) {  max = matrix[i]; }
            if (matrix[i] <= min) {  min = matrix[i]; }
        }
        System.out.println("Max= " + max);
        System.out.println("Min = " + min);
    }
}

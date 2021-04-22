package OfficeHours.Mine.Array_Practice_2;

public class Gradebook {
    public static void main(String[] args) {
        String[] names = {"Bolor", "Mindy", "oogii", "Samed", "Gokay", "Mustafa", "Tatiana"};
        int[] score = {95, 96, 97, 100, 99, 87, 92};
        char[] grade = new char[score.length];


        for (int i = 0; i < names.length; i++) {

            if (score[i] >= 90) {
                grade[i] = 'A';
            } else if (score[i] >= 80 && score[i] < 90) {
                grade[i] = 'B';
            } else if (score[i] >= 70 && score[i] < 80) {
                grade[i] = 'C';
            } else if (score[i] >= 60 && score[i] < 70) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }

            System.out.print(names[i] + "|" + score[i] + "|" + grade[i]+"\n");

        }

        System.out.println();

}
}

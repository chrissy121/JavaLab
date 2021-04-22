package OfficeHours.Mine;

import java.util.Scanner;

public class CatDogCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = "catcatdog";
        String wordCopy = word; // save

        for (; ; ) {
            int index1 = word.indexOf("cat");
            if (index1 != -1) {
                countOfCats++;
                word = word.substring(index1 + 3);
            } else {
                break;
            }
        }
        System.out.println(countOfCats);

        for (; ; ) {
            int index2 = wordCopy.indexOf("dog");
            if (index2 != -1) {
                countOfDogs++;
                wordCopy = wordCopy.substring(index2 + 3);
            } else {
                break;
            }
        }

        System.out.println(countOfDogs);

    }
}

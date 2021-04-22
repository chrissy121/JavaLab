package OfficeHours.Mine.Array_Practice_2;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String words = "nife, wooden spoons, plates, cups, forks, pan, pot, trash can,fridge,dish washer";

        String[] strArray = words.split(",");
        String myString = "";

        for (int i=0; i<strArray.length; i++) {
            if (strArray[i].trim().indexOf(" ")!=-1) {
                myString += strArray[i]+"\n";
            }

        }

        System.out.println(myString);

    }
}

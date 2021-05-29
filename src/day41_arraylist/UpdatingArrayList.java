package day41_arraylist;


import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {

        List<String> myCars= new ArrayList<>();

        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        System.out.println(myCars.toString());
        String allCarsIn1St = myCars.toString();

        System.out.println("See now 1 single string = " + allCarsIn1St);

        //change index 0 to Lamborghini

        myCars.set(0, "Lamborghini");
        myCars.set(4, "Honda");
        System.out.println(myCars);

        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("moskvich");

        System.out.println("moskvichIndex = " + moskvichIndex);

        //change moskvich to jiguli
        myCars.set(moskvichIndex, "jiguli");

        System.out.println(myCars);


        if (myCars.contains("lada")) {

            myCars.set(myCars.indexOf("lada"), "bugatti");
        } else {
            System.out.println("lada is not found");
        }
        System.out.println(myCars.toString());



        for (int i = 0; i < myCars.size(); i++) {

             if(myCars.get(i).equals("lamborghini")) {
                myCars.set(i, "prius");

            } else if(myCars.get(i).equals("toyota")) {
                myCars.set(i, "lexus");

            } else if (myCars.get(i).equals("trabant")){
                myCars.set(i, "audi");
            }
        }

        System.out.print(myCars.toString());

    }
}

package test01_test;

public class TeamPractice {
    public static void main(String[] args) {
        String[] names ={"Gokay", "Otgon", "Chrissy", "Tatiana"};
        String[] names3 = {"Chrissy", "Samed", "Mustafa", "Chrissy"};

        String temp = "";
        for (String each : names3) {
        int count = 0;
        for(String each2 : names) {
            if(each==each2 && (!temp.contains(each))) {
                count++;
                temp += each;

            }
        }
    }

    System.out.println(temp);

    }
}

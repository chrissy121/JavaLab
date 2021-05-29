package OfficeHours.Mine;

public class MjQ1 {
    public static void main(String[] args) {

        String num = String.valueOf(2.5);
        int num1 = 2;  //num1 = 2
        num += num1;   // num = num + num1 => num = "2.5" + 2 = >num = "2.52"

        float num2 = Float.parseFloat(num); //unboxing: num2 = 2.52

    }
}

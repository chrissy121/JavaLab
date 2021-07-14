package OfficeHours.Mine.JavaIQ;

public class Armstrong {
    public static void main(String[] args) {

        System.out.println("This number is Armstrong? " + isArmstrong(153));

    }
    public static boolean isArmstrong(int number) {
        String strNum = number+"";
        int sum = 0;
        int length = strNum.length();

        for (int i = 0; i < length; i++) {

            int eachDigit = Integer.parseInt(strNum.charAt(i)+"");
            sum += Math.pow(eachDigit, length);
        }

        return number==sum;
    }

}

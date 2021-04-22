package test01_test;

public class FindIntInString {
    public static void main(String[] args) {
        String str = "Today i am gonna walk 123456 steps and im gonna do this 7 days. all day long 24 hours.";
        String result = "";

        String[] strArr = str.split(" ");

        for (String each : strArr) {

            for (int j=0; j< each.length(); j++) {

                if(Character.isDigit(each.charAt(j))) {
                    result += each + " ";
                    break;
                }
            }
        }
        System.out.println(result);
    }
}

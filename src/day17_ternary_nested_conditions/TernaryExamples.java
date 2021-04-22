package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 76;
      String result = (score > 60) ? "pass" : "fail";
        System.out.println("result = " + result);

        String quality = "perfect";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println(x);
        int score3 = 100;

        char grade = ( score3 > 90 ) ? 'A' : 'B';
        System.out.println("grade = " + grade);




    }


}

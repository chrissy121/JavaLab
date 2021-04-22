package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
       char grade = 'A';
       if (grade== 'A' || grade== 'B' || grade== 'C') {
           System.out.println("Passed with " + grade);
       } else if (grade == 'D'){
           System.out.println("Quality for retake" + grade);
       } else if (grade == 'E'){
           System.out.println("Fail" + grade);
       } else {
           System.out.println("Invalid grade" + grade);
       }
    }
}

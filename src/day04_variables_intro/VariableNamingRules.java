package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
    // int static=22; -> error, static is RESERVED by Jave
        int Static=22;
        int static2=21;
        int staticVar=20;

        int salary$=55;
        //int 1rstMonthSalary=3000;-> ERROR, cannot start with number

        int $=20; // work fine but not recommended
        int _=3;  // not good, use meaningful variable names

        int numOfFriends=401;
        int num_Of_Friends=401; // not convention



    }
}

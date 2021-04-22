package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        int apples = 5;
        System.out.println(!( apples < 2));
        System.out.println(!false);
        int age=20;

        if (!(age >7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat. age = " + age);
        }

        boolean isSmokingAllowed = false;
        if ( !isSmokingAllowed ) {
            System.out.println("Smoking is not allowed here. Exit");
        }
        boolean isAffordable = false;
        // if its Not affordable "Item not affordable"

        if (!isAffordable) {
            System.out.println("Item not affordable");
        }
        String env = "qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong environment for QA testing");
        }
        String carModel = "Honda";
        // if its not

        if(!carModel.equals("Tesla")) {
            System.out.println("I am not intested " + carModel);
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if( !inputPassword.equals("abc123") ) {
            System.out.println("Incorrect Password");
        }
        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }

        int n=2;
        switch(n) {
            case 1:
                System.out.println("n is 1");
                break;
            case 2:
                System.out.println("n is 2");
                break;
            case 3:
                System.out.println("n is 3");
                break;
            default:
                System.out.println("n is not 1,2,3");
        }


    }
}

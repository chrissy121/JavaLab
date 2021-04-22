package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        System.out.println(sum(5, 67));
        loginVoid("CybertekStudent", "abc123"); // POSITIVE TEST / SUNNY DAY/;,nb
        loginVoid("cebertek", "answer");  // NEGATIVE TEST / RAINY TEST SCENARIO
        loginVoid("", "");
        System.out.println(login("CybertekStudent", "abc123"));

        if(login("CybertekStudent", "abc123")==true) {
            System.out.println(" Login successfull, welcome to Canvas");
            System.out.println("Select the course to continue");
        } else {
            System.out.println(" Login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);


        if (login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas, select course or calendar");
        } else {
            System.out.println("Something wrong with your credentials");
        }


    }

    public static int sum(int nums1, int nums2) {
        int result;
        result = nums1 + nums2;
        return result;

    }

    public static void loginVoid(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Successful, welcome cybertekStudent");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        return  username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword);

//        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
//            return true;
//        }
//        return false;
    }
}



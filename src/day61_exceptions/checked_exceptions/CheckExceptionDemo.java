package day61_exceptions.checked_exceptions;

public class CheckExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("About to sleep for 5 seconds");
        /**
         * Thread.sleep(1000); causes/throws on InterruptedException, which is a checked exception.
         * 1st arga
         */

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(5000); //2nd way, main-ii ard throws ashiglasan


        System.out.println("Woke up after 10 seconds");
    }
}

public class Recursion {
    public static void main(String[] args) {

        System.out.println(Partorial(20));


    }
    public static long Partorial(int n) {

        long factorial = 1;

        for(int i=1; i<n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}



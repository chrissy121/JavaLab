package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 123, 300);
        addNumbers(23, 34, 333,45, 67, 56, 6);
        addNumbers();
    }

                                 // varargs
    public static void addNumbers (int ...nums){
        // inside the method, it it used as regular array
      int sum =0;
      for(int n : nums) {
          sum += n;
      }
        System.out.println("sum = " + sum);
    }

}

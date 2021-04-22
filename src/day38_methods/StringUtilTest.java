package day38_methods;
import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {

        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: User cannot be null or empty");
        }

        System.out.println(isPalindrome("Cybertek"));

        // 1-r arga
        System.out.println(StringUtils.reverse("bolor"));

        // 2-r arga
        String word = "sunday";
        String revWord = StringUtils.reverse(word);
        System.out.println("revWord = " + revWord);

        //3-r arga
        System.out.println(reverse("Uuganaa"));





    }

}

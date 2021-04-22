package day19_class_vs_object_string;

public class StringCaseConversation {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "123 Java is fun";
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(word);
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase-" + company.toUpperCase());
        System.out.println("java".toUpperCase());
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }

}

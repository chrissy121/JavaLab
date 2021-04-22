package day19_class_vs_object_string;

public class StringStartsEndsWith {
    public static void main(String[] args) {

        String word = "Xairtai shuu";
        System.out.println(word.startsWith("Xair"));
        System.out.println("Xairtai".endsWith("I"));
        System.out.println(word.endsWith("Xairtai"));
        System.out.println(word.endsWith("shuu"));

        String firstname = "Dr.Nadir";
        if (firstname.startsWith("Mr")) {
            System.out.println("Man");
        } else if (firstname.startsWith("Mrs")) {
            System.out.println("Married woman");
        } else if (firstname.startsWith("Dr")) {
            System.out.println("Doctor");
        } else if (firstname.startsWith("Ms")) {
            System.out.println("Single woman");
        }

        String url = "https:// www.news.mn";
        if (url.endsWith(".com")) {
            System.out.println("USA web site");
        } else if (url.endsWith(".mn")) {
            System.out.println("Mongolian web site");
        } else if (url.endsWith(".edu")) {
            System.out.println("Educational organization");
        } else if(url.endsWith("gov")) {
            System.out.println("Government website");
        } else if(url.endsWith(".ru")) {
            System.out.println("Russian website");
        }



    }
}

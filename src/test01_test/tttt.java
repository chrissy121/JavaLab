package test01_test;

public class tttt {
    public static void main(String[] args) {
        String name = "Tatiana Barbulat";
        int ixd = name.indexOf(" ");
        name = name.substring(ixd+1);

        name = name.replaceFirst("a", "e");
        System.out.println(name);

    }
}

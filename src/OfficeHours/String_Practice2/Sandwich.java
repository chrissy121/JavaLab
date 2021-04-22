package OfficeHours.String_Practice2;

public class Sandwich {
    public static void main(String[] args) {
        String str = "breadjambread";
        boolean isValid = false;

      if(str.contains("bread")) {
          int firstBread = str.indexOf("bread");


          if(str.substring(firstBread+5).contains("bread")) {
            //  int secondBread = str.substring(firstBread+5).indexOf("bread");
              int secondBread = str.lastIndexOf("bread");
              String result = str.substring(firstBread+5, secondBread);

              if (result.isEmpty()) {
                  System.out.println("nothing");
              } else {
                  System.out.println(result);
              }

          }

      } else {
          System.out.println("nothing");
      }

    }
}

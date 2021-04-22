package OfficeHours.String_Practice2;

public class SMS_Parts {
    public static void main(String[] args) {
        String sentence = "Sender: <James Bond>. From Number: [202-123-3456]. + " +
                "Message: {I love programming and problem solving}";

        String actualSender = sentence.substring(sentence.indexOf("<") + 1, sentence.indexOf(">") );
        String actualNumber = sentence.substring(sentence.indexOf("[") + 1, sentence.indexOf("]") );
        String actualMessage = sentence.substring(sentence.indexOf("{") + 1, sentence.indexOf("}") );

        System.out.println("Sender: " + actualSender);
        System.out.println("Number: " + actualNumber);
        System.out.println("Message: " + actualMessage);

    }
}

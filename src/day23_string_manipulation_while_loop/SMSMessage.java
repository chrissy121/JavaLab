package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ Bolormaa] From Number<2223334444> Message:{Hello, lets code some java}";
        int first = message.indexOf("[");
        int last = message.indexOf("]");
        String sender = message.substring(first+1, last);
        System.out.println(sender);

        int first1 = message.indexOf("<");
        int last1 = message.indexOf(">");
        String mobile = message.substring(first1+1, last1);
        System.out.println(mobile);

        int first2 = message.indexOf("{");
        int last2 = message.indexOf("}");
        String text = message.substring(first2+1, last2);
        System.out.println(text);
        sender = sender.trim();
        if(sender.equals("Bolormaa")) {
            System.out.println("Message from Bolormaa about homework");
        } else {
            System.out.println("Someone else message");
        }
    }
}

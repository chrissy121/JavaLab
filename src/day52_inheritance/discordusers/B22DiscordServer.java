package day52_inheritance.discordusers;

public class B22DiscordServer {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setId(1234);
        user1.setName("Syleman");
        user1.setRole("Student");

        Admin admin1= new Admin();
        admin1.setId(1222);
        admin1.setName("Chrissy");
        admin1.setRole("Teacher");

        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2 = new Admin("Chrissy", 4138);
        System.out.println(admin2.toString());
    }
}

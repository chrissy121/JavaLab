package OfficeHours.Practice_06_28_2021;


import java.util.ArrayList;
import java.util.Arrays;

public class Facebook extends SocialMedia{

    String username;
    String password;
    String fullName;
    int age;
    int numberOfFriends;

    ArrayList<Post>  allPosts;

    @Override
    public void directMessage(String username, String message) {
        System.out.println(message + " was sent to " + username);
    }

    @Override
    public void post(String body) {

    }

    @Override
    public void notification() {

    }
}

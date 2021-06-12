package day52_inheritance.discordusers;

public class User extends Object {
    private String name;
    private String role;
    private long id;

    public User() {
        System.out.println("User class constructor");
    }

    public User(String name, String role, long id) {
        System.out.println("User class 3 args constructor");
        this.name = name;
        this.role = role;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", id=" + id +
                '}';
    }
}

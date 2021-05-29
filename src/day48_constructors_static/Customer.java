package day48_constructors_static;

public class Customer {
    private String firstName;
    private int id;


    //No-Args Constructor
    public Customer() {
        System.out.println("No-args constructor");
        firstName = "new customer";
        id = -1;
    }
    //add a Constructor with params where we can assign name and id
    public Customer(String firstName, int id) {
        System.out.println("2-args constructor");
        this.firstName = firstName;  //setName(firstName)
        this.id = id;                //setId(id); when we have some conditions in setter, reuse
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}

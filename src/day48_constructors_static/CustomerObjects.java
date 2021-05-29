package day48_constructors_static;

import day43_list_custom_classes.ListMethods;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1);
        cs1.setId(1);
        cs1.setFirstName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("John Ward III", 4873);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        //arrayList of Customer object
        ArrayList<Customer> customersList = new ArrayList<>();
        customersList.add(cs1);
        customersList.add(cs2);
        customersList.add(cs3);
        customersList.add(new Customer("Bashir", 449));
        customersList.add(new Customer("Suleyman", 9763));
        customersList.add(new Customer("Bolormaa", 5507));

        //Print info of first customer object in array and arrayList
//        System.out.println(todaysCustomers[0]);
//        System.out.println(todaysCustomers[1]);
//        System.out.println(todaysCustomers[2]);

        for (int i =0; i<todaysCustomers.length; i++) {
           System.out.println(todaysCustomers[i].toString());
        }

        System.out.println("----FOR LOOP ----");
        for (int i =0; i<customersList.size(); i++) {
            System.out.println(customersList.get(i));
        }
        System.out.println("----FOR EACH LOOP ----");
        for (Customer eachCustomer : customersList) {
           System.out.println(eachCustomer);
       }
        //print only names of Customers in the list
        System.out.println("----NAMES OF CUSTOMERS ----");
        for (Customer eachCustomer : customersList) {
            System.out.println(eachCustomer.getFirstName());
        }

        System.out.println("----USING LAMBDA EXPRESSION----");
        customersList.forEach(each-> System.out.println(each.getFirstName()));

    }
}

package task3;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<Customer>();
    public static void main(String[] args) {

        addCustomer(new Customer("Anne-Grethe", "Gretesen", "gr8erboy"));
        addCustomer(new Customer("Thorvald", "Lauritzen", "XXX_snipenoscopeHEADshot___XXX_1997"));
        addCustomer(new Customer("Bob", "Bobson", "Bobthebuilder"));
        addCustomer(new Customer("Didrik", "Diddesen", "didder007"));
        addCustomer(new Customer("Mark", "isMyName", "ohHiMark"));
        addCustomer(new Customer("Tommy", "Wiseau", "favoriteCustomer"));

        printCustomers();

        Customer c = findCustomer(4);
        System.out.println(c);
    }

    public static void printCustomers() {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    public static void addCustomer(Customer c) {
        // Gets an ID here
        customers.add(new Customer(c, customers.size()));
    }

    public static Customer findCustomer(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                return c;
            }
        }
        Customer c = new Customer("CouldNotFind", "CustomerWithMatchingID", "noFinding");
        return new Customer(c, id);
    }
}

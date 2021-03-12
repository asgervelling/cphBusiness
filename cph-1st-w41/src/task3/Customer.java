package task3;

public class Customer {

    private String firstName, lastName;
    private String username;
    private int id;

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = 0;
    }

    public Customer(Customer c, int id) {
        this.firstName = c.getFirstName();
        this.lastName = c.getLastName();
        this.username = c.getUsername();
        this.id = id;
    }

    public String toString() {
        return String.format("\nName:\t\t%s %s\n" +
                             "Username:\t%s\n" +
                             "ID:\t\t\t%d",
                             firstName, lastName, username, id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

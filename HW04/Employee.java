public class Employee {
    private String FirstName;
    private String LastName;
    private Address address;

    public Employee(String firstName, String lastName, Address address) {
        FirstName = firstName;
        LastName = lastName;
        this.address = address;
    }

    public void printEmployee() {
        System.out.print("Name: " + FirstName + " " + LastName + " | Address: ");
        address.printAddress();
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
}

import java.util.Arrays;

public class Address {
    private String street;
    private int apartment;
    private String city;
    private char[] state;

    private Address(){

    }

    public Address(String street, String city, char[] state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public Address(String street, int apartment, String city, char[] state) {
        this.street = street;
        this.apartment = apartment;
        this.city = city;
        this.state = state;
    }

    public void printAddress() {
        if (apartment == 0) {
            System.out.println(street + ", " + city + ", " + new String(state));
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class AddressBookSystem {

    List<Contact> contactList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");

    }
    public void add(Contact contact){
        System.out.println("Contact Added");
        contactList.add(contact);
    }
}


class Contact{
    String firstName,lastName, state, phoneNumber, city;

    public Contact(String firstName, String lastName, String state, String phoneNumber, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.city = city;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookSystem {

    static List<Contact> contactList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");
        Contact contact = new Contact("Bhagya","raju", "Andhra", "32524234","rjy");
        contactList.add(contact);
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        addressBookSystem.searchInContactList();
    }
    public void addPersonDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName = in.next();
        System.out.println("Enter lastName");
        String lastName = in.next();
        String state,phoneNumber,city;
        System.out.println("Enter state");
        state =in.next();
        System.out.println("enter PHone number");
        phoneNumber = in.next();
        System.out.println("Enter city ");
        city = in.next();
        Contact contact = new Contact(firstName,lastName,state,phoneNumber, city);

        System.out.println("Contact Added");
        contactList.add(contact);
    }

    public void edit(String name){
        System.out.println("to edit person details");
        for(Contact contact : contactList){
            if(contact.getFirstName() == name){
                Scanner in = new Scanner(System.in);
                System.out.println("Enter Name to change");
                String newName = in.next();
                contact.setFirstName(newName);
            }
        }

    }

    public void deletePersonDetails(){
        System.out.println("To delete the details of person enter name");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        for(Contact contact : contactList){
            if (contact.getFirstName() == name){
                contactList.remove(contact);
            }
        }
    }

    public void addMultiple(){
        Scanner in = new Scanner(System.in);
        while (true){
           AddressBookSystem addressBookSystem = new AddressBookSystem();
           addressBookSystem.addPersonDetails();

        }
    }

    public void searchInContactList(){
        System.out.println("Enter the person Name");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        List<Contact> contacts = contactList.stream().filter(o -> o.getFirstName().equals(name)).collect(Collectors.toList());
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return getFirstName().equals(contact.getFirstName()) && getLastName().equals(contact.getLastName()) && getState().equals(contact.getState()) && getPhoneNumber().equals(contact.getPhoneNumber()) && getCity().equals(contact.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getState(), getPhoneNumber(), getCity());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
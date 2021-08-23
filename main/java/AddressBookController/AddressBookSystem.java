package AddressBookController;

import java.util.Hashtable;
import java.util.Scanner;

public class AddressBookSystem {
    String first_name;
    String last_name;
    String address;
    String city;
    String state;
    int zip;
    String phone_number;
    String email;
    //Create a parameterized constructor
    AddressBookSystem(String first_name, String last_name, String address, String city, String state, int zip, String phone_number, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_number = phone_number;
        this.email = email;
    }
    public static void main(String args[]){
        //Create object and pass the values
        AddressBookSystem obj = new AddressBookSystem("SAYANI","KOLEY","Howrah", "Howrah", "West Bengal", 711101, "7908", "sayanikoley8@gmail.com");

        //Display the values of object
        obj.display();
    }
    public void display() {
        System.out.println("First Name: " +first_name);
        System.out.println("Last Name: " +last_name);
        System.out.println("Address: " +address);
        System.out.println("City: " +city);
        System.out.println("State: " +state);
        System.out.println("Zip: " +zip);
        System.out.println("Phone number: " +phone_number);
        System.out.println("Email: " +email);
    }


    }
class Contact_Person {
    String first_name;
    String last_name;
    String address;
    String city;
    String state;
    int zip;
    String phone_number;
    String email;

    public Hashtable<String, String> insertContactDetails(Scanner input, Hashtable<String, String> totalContact) {
        System.out.print("Enter the First Name: ");
        this.first_name = input.next().toString();
        totalContact.put("first_name", first_name);
        System.out.print("Enter the Last Name: ");
        this.last_name = input.next().toString();
        totalContact.put("last_name", last_name);
        System.out.print("Enter the Address: ");
        this.address = input.next().toString();
        totalContact.put("address", address);
        System.out.print("Enter the City: ");
        this.city = input.next().toString();
        totalContact.put("city", city);
        System.out.print("Enter the State: ");
        this.state = input.next().toString();
        totalContact.put("state", state);
        System.out.print("Enter the Zip: ");
        this.zip = input.nextInt();
        totalContact.put("zip", String.valueOf(zip));
        System.out.print("Enter the Phone Number: ");
        this.phone_number = input.next().toString();
        totalContact.put("phone_number", phone_number);
        System.out.print("Enter the Email: ");
        this.email = input.next().toString();
        totalContact.put("email", email);

        System.out.println();
        return totalContact;
    }
    public void display(Hashtable<String,String> totalContact) {
        System.out.println("First Name: " +totalContact.get("first_name"));
        System.out.println("Last Name: " +totalContact.get("last_name"));
        System.out.println("Address: " +totalContact.get("address"));
        System.out.println("City: " +totalContact.get("city"));
        System.out.println("State: " +totalContact.get("state"));
        System.out.println("Zip: " +totalContact.get("zip"));
        System.out.println("Phone number: " +totalContact.get("phone_number"));
        System.out.println("Email: " +totalContact.get("email"));
        System.out.println();
    }
}


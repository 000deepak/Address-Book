package AddressBook;
import java.util.ArrayList;
import java.util.Scanner;

/*
* Program for address book to create contacts
* @deepak   started-6/10/21
*
*/

public class AddressBook {

    static Person record = new Person();
    static ArrayList list = new ArrayList();

    public static String firstName;                       //Obj Attributes
    public static String lastName;
    public static String address;
    public static String city;
    public static String state;
    public static String zipCode;
    public static String phoneNo;
    //public static String email;



    public String toString() {
        return "first name " + firstName + " \nlast name" + lastName+"\naddress"+address+"\ncity"+
                city+"\nzipcode"+zipCode+"\nphoneno"+phoneNo;
    }

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        //asking user input
        System.out.println("Please enter details to be added.");
        System.out.print("First Name: ");
        record.setFirstName(sc.next());
        System.out.print("Last Name: ");
        record.setLastname(sc.next());
        System.out.print("Address: ");
        //record.setAddress(sc.next());
        System.out.print("City: ");
        //record.setCity(sc.next());
        System.out.print("State: ");
        //record.setState(sc.next());
        System.out.print("ZipCode: ");
        //record.setZipCode(sc.next());
        System.out.print("Phone No.: ");
        record.setPhoneNo(sc.next());
        System.out.println("Created entry for " + firstName + " " + lastName);

        record.toString();

        //list.add(record);                    //Adding entry to record
        //System.out.println(list);


    }

}

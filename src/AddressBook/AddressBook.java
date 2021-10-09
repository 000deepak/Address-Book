package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/*
 * Program for address book to create contacts
 * @deepak   started-6/10/21
 *
 */
//UC1-create a contact in address book
public class AddressBook {

    static PersonDetails record = new PersonDetails();
    static List<PersonDetails> book = new ArrayList<PersonDetails>();
    static Scanner sc = new Scanner(System.in);
    public static String firstName;                       //Obj Attributes
    public static String lastName;
    public static String address;
    public static String city;
    public static String state;
    public static String zipCode;
    public static String phoneNo;


    public String toString() {
        return "first name " + firstName + " \nlast name" + lastName + "\naddress" + address + "\ncity" +
                city + "\nzipcode" + zipCode + "\nphoneNo" + phoneNo;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("enter your choice \n1.add entry\n2.edit entry\n3.delete entry");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addEntry();
                    break;
                case 2:
                    edit(book);
                    break;
                case 3:
                    delete(book);
                    break;
            }
        }
    }

    /*asking user input_UC2                Adding entry record to book*/
    private static void addEntry() {
        System.out.println("Please enter details to be added.");
        System.out.print("First Name: ");
        record.setFirstName(sc.next());
        System.out.print("Last Name: ");
        record.setLastname(sc.next());
        System.out.print("Address: ");
        record.setAddress(sc.next());
        System.out.print("City: ");
        record.setCity(sc.next());
        System.out.print("State: ");
        record.setState(sc.next());
        System.out.print("ZipCode: ");
        record.setZipcode(sc.next());
        System.out.print("Phone No.: ");
        record.setPhoneNo(sc.next());
        System.out.println("Created entry for " + record.firstName + " " + record.lastName);

        record.toString();
        book.add(record);
        System.out.println(book);
    }

    //method for edit_UC3
    public static void edit(List<PersonDetails> book) {
        System.out.println("Please enter name of contact.");
        String name = sc.next();
        String lower_name = name.toLowerCase();

        for (PersonDetails i : book) {
            String nameR = i.firstName.toLowerCase();
            if (lower_name.equals(nameR)) {
                System.out.println("Please enter new details.");
                System.out.print("Address: ");
                record.address = sc.next();
                System.out.print("City: ");
                record.city = sc.next();
                System.out.print("State: ");
                record.state = sc.next();
                System.out.print("ZipCode: ");
                record.zipCode = sc.next();
                System.out.print("Phone No.: ");
                record.phoneNo = sc.next();

                System.out.println("Record updated.");
                break;
            }

        }
    }
    //method for delete_UC4
    public static void delete(List<PersonDetails> book) {
        System.out.println("Please enter name of contact.");
        String nameIn = sc.next();
        String lower_name = nameIn.toLowerCase();

        for (PersonDetails i : book) {
            String nameR = i.firstName.toLowerCase();
            if (lower_name.equals(nameR)) {
                book.remove(i);            //delete entry from record
                System.out.println("Record deleted for " + i.firstName + " " + i.lastName);
                System.out.println("Record updated.");
            } else {
                System.out.println("No entry found for " + nameIn);
            }
        }
    }


}

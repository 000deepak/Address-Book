package AddressBook;

public class Person {

        public String firstName;
        private String lastName;
        private String phoneNo;
        private Address address;

    public String getPhoneNo() {return phoneNo;}

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [firstname=" + firstName + ", lastname=" + lastName + ", address="
                + address + "]";
    }
}

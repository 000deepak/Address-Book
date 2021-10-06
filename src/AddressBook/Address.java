package AddressBook;

public class Address {
    public String city;
    private long zipcode;
    private String state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getZip() {
        return zipcode;
    }

    public void setZip(long zip) {
        this.zipcode = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



}

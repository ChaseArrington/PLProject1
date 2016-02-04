package arrington.customer;

public class Customer {

    // Creating the instance variables
    private String name;
    private String address;
    private String city;
    private String state;
    private String postalCode;

    // Creating the constructor
    public Customer() {
        name = "";
        address = "";
        city = "";
        state = "";
        postalCode = "";
    }

    // The get and set methods for the name variable
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    // The get and set methods for the address variable
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    // The get and set methods for the city variable
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity(){
        return city;
    }

    // The get and set methods for the state variable
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    // The get and set methods for the postalCode variable
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getPostalCode() {
        return postalCode;
    }

    // The get method for Name and Address in the desired format
    public String getNameAndAddress() {
        return getName() + "/n" + getAddress() + "/n" + getCity() + ", " + getState() + "/n" + getPostalCode();
    }


}

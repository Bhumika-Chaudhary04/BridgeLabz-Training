package AddressBook;
import java.util.Objects;
//contact person class
public class ContactPerson {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String email;

	// constructor to initialize object
	public ContactPerson(String firstName, String lastName, String address, String city, String state, String zipCode,
			String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	// getter methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	// setter methods so that details can be edited for UC3
	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//UC7: Override equals() for duplicate check
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ContactPerson)) return false;
        ContactPerson other = (ContactPerson) obj;
        return firstName.equalsIgnoreCase(other.firstName)
                && lastName.equalsIgnoreCase(other.lastName);
    }
    
    //hashCode must be overridden with equals
    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }
    
	// method to display contact details of a person
	public void displayContact() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Address: " + address);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Zip Code: " + zipCode);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Email: " + email);
		System.out.println("\n");
	}
	@Override
	public String toString() {
	    return "ContactPerson {" +
	            "First Name='" + firstName + '\'' +
	            ", Last Name='" + lastName + '\'' +
	            ", City='" + city + '\'' +
	            ", State='" + state + '\'' +
	            ", Phone='" + phoneNumber + '\'' +
	            ", Email='" + email + '\'' +
	            '}';
	}
	
	

}

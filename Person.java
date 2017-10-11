
public class  Person {

	private String personCode;
	private String name;
	private Address address;
	private String emailAddress;

	public Person(String personCode, String name, Address address, String emailAddress) {
		this.personCode = personCode;
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
	}

	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	


}

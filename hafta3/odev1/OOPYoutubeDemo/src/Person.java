
public class Person extends Customer{
	private String nationalİdentity;
	private String firstName;
	private String lastName;

	public Person() {
	}

	public Person(int id, String city, String nationalİdentity, String firstName, String lastName) {
		this.nationalİdentity = nationalİdentity;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getNationalİdentity() {
		return nationalİdentity;
	}

	public void setNationalİdentity(String nationalİdentity) {
		this.nationalİdentity = nationalİdentity;
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

}

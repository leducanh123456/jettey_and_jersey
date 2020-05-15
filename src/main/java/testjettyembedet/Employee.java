package testjettyembedet;

import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement
public class Employee {
	private String firstName;
	private String lastName;
	private long id;
	private Address permAddrees;
	private Address tempAddrees;

	public Employee() {
		this("No Data", "No Data", -1, new Address(), new Address());
	}

	public Employee(String firstName, String lastName, long id, Address permAddrees, Address tempAddrees) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.permAddrees = permAddrees;
		this.tempAddrees = tempAddrees;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Address getPermAddrees() {
		return permAddrees;
	}

	public void setPermAddrees(Address permAddrees) {
		this.permAddrees = permAddrees;
	}

	public Address getTempAddrees() {
		return tempAddrees;
	}

	public void setTempAddrees(Address tempAddrees) {
		this.tempAddrees = tempAddrees;
	}

}
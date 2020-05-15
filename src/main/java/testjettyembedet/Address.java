package testjettyembedet;

import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement
public class Address {
	private String street;
	private String city;
	private String state;
	private String country;

	public Address() {
		this("No Data", "No Data", "No Data", "No Data");
	}

	public Address(String area, String city, String state, String country) {
		super();
		this.street = area;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getArea() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

	public void setArea(String area) {
		this.street = area;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
	}

}
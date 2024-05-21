
public class Address {
	private String buildingNumber;
	private String street;
	private String zipcode;
	private String city;
	private String country;
	
	public Address(String street, String buildingNumber, String zipcode, String city, String country) {
		this.street = street;
		this.buildingNumber = buildingNumber;
		this.zipcode = zipcode;
		this.city = city;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getbuildingNumber() {
		return buildingNumber;
	}
	public void setbuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}

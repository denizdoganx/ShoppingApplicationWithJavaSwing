

public abstract class Person {
	private String name;
	private String surname;
	private String phone;
	private String email;
	private Address address;
	public Person(String name, String surname, String phone, String email, Address address) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

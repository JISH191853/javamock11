
public class User {
	private String name;
	private String email;
	private String phoneNumber;
	private String location;
	
	public User( ) { }

	public User(String name, String email, String phoneNumber, String location) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		String output="";
		output=String.format("Name: %s\nEmail: %s\nPhoneNumber: %s\nlocation: %s",name,email,phoneNumber,location);
		return output;
	}
	
	@Override
	public boolean equals(Object obj) {
		User arg=(User) obj;
		return this.getName().equalsIgnoreCase(arg.getName()) && this.getEmail().equals(arg.getEmail());
	}
	
	
	
	
	
}

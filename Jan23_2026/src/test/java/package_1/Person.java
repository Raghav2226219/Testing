package package_1;

public class Person {
	
	String FirstName;
	String LastName;
	Gender Gender;

	String MobileNumber;
	
	public Person(String fn, String ln, Gender gn) {
		this.FirstName = fn;
		this.LastName = ln;
		this.Gender = gn;
	}
	
	public Person(String fn, String ln, char g) {
		this.FirstName = fn;
		this.LastName = ln;
		Gender parsed = Gender.imp(String.valueOf(g));
		if (parsed == null) {
			throw new IllegalArgumentException("Gender must be 'M' or 'F'");
		}
		this.Gender = parsed;
	}
	
	public Person(String fn, String ln, Gender c, String mn) {
		this.FirstName = fn;
		this.LastName = ln;
		this.Gender = c;
		this.MobileNumber = mn;
	}
	
	public String getMobileNumber() {
		return MobileNumber;
	}
	
	
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Gender getGender() {
		return Gender;
	}

	public void setGender(Gender gender) {
		Gender = gender;
	}

}

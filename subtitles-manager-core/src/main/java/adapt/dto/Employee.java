package adapt.dto;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String title;
	private String phoneNumbers;
	private String email;
	private String skype;
	private String workingDirectory;
	private Long birthDay;
	private Boolean inStaff;
	private Boolean hired;

	@Override
	public String toString() {
		return "ID: " + id + " - " + firstName + " " + lastName + "; пошта: " + email + "; зараз працює: " + ((hired != null) ? (hired ? "так" : "ні") : "немає даних");

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getWorkingDirectory() {
		return workingDirectory;
	}

	public void setWorkingDirectory(String workingDirectory) {
		this.workingDirectory = workingDirectory;
	}

	public Long getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Long birthDay) {
		this.birthDay = birthDay;
	}

	public Boolean getInStaff() {
		return inStaff;
	}

	public void setInStaff(Boolean inStaff) {
		this.inStaff = inStaff;
	}

	public Boolean getHired() {
		return hired;
	}

	public void setHired(Boolean hired) {
		this.hired = hired;
	}

}

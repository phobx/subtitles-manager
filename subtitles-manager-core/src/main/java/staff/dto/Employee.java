package staff.dto;

import java.util.Calendar;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int title;
	private String phoneNumbers;
	private String email;
	private String skype;
	private String workingDirectory;
	private Calendar birthDay;

	// private boolean isHired;
	// private boolean isVisible;

	public String toString() {
		return "ID: " + id + " - " + firstName + " " + lastName + "; пошта: " + email + "; ДР: " + birthDay /* + "; зараз працює: " + (isHired ? "так" : "ні")*/;
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

	public int getTitle() {
		return title;
	}

	public void setTitle(int title) {
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

	public Calendar getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Calendar birthDay) {
		this.birthDay = birthDay;
	}
	/*
	 * public boolean isHired() { return isHired; }
	 * 
	 * public void setHired(boolean isHired) { this.isHired = isHired; }
	 * 
	 * public boolean isVisible() { return isVisible; }
	 * 
	 * public void setVisible(boolean isVisible) { this.isVisible = isVisible; }
	 */
}

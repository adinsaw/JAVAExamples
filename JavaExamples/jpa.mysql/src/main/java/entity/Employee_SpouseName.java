package entity;

import javax.persistence.Id;

public class Employee_SpouseName 

	{@Id String FirstName;
	@Id String LastName;
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
	public Employee_SpouseName(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	public Employee_SpouseName() {}

}

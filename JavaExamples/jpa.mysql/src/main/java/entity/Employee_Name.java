package entity;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable
public class Employee_Name {
	 String FirstName;
	 
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
		String LastName;
		public Employee_Name(String firstName, String lastName) {
			
			FirstName = firstName;
			LastName = lastName;
		}
		public Employee_Name() {}

}

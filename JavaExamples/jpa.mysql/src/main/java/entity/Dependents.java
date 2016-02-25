package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity @IdClass(Employee_SpouseName.class)
		
	
@Table
public class Dependents {
	@Id String LastName;
	@Id String FirstName;
	public Dependents(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	public Dependents(Employee_SpouseName sp) {
		this.FirstName=sp.FirstName;
		this.LastName=sp.LastName;
		// TODO Auto-generated constructor stub
	}
	public Dependents() {}
	


}

package entity;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table
public class Address {
	@EmbeddedId Employee_Name Name;

	private String street;
	public Employee_Name getName() {
		return Name;
	}
	
	public void setName(Employee_Name name) {
		Name = name;
	}
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	public Address(Employee_Name name, String street) {
		super();
		Name = name;
		this.street = street;
	}
	public Address() {}	
	
	
}

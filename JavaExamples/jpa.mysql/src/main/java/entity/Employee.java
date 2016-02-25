package entity;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int eId;
private String name;
private double salary;
private String deg;
@OneToOne
@JoinColumns({
  @JoinColumn(name="FirstName", referencedColumnName="FirstName"),
  @JoinColumn(name="LastName", referencedColumnName="LastName")
})
private Address address;

@OneToMany
@JoinColumns({
  @JoinColumn(name="DependentFirstName", referencedColumnName="FirstName"),
  @JoinColumn(name="DependentLastName", referencedColumnName="LastName")
})
private List<Dependents> dependent;

public List<Dependents> getDependent() {
	return dependent;
}
public void setDependent(List<Dependents> dependent) {
	this.dependent = dependent;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public Employee(int eId, String name, double salary, String deg) {
	super();
	this.eId = eId;
	this.name = name;
	this.salary = salary;
	this.deg = deg;
}
public Employee( ) {}
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDeg() {
	return deg;
}
public void setDeg(String deg) {
	this.deg = deg;
}
public String toString() {
    return String.format(
            "Customer[id=%d, Name='%s', sal='%s']",
            eId, salary,deg);}

}


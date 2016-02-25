package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	public static void main (String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		//!-- CREATE -->
		Employee emp=new Employee();
		
		Employee_SpouseName sp=new Employee_SpouseName("CC","DD");
		Dependents dep=new Dependents(sp);
		Employee_SpouseName sp2=new Employee_SpouseName("EE","FF");
		Dependents dep1=new Dependents(sp2);
		Address add=new Address();
		Employee_Name fullname=new Employee_Name("AA","BB");
		List<Dependents> dependents= new ArrayList();
		add.setName(fullname);
		add.setStreet("Estuary");
		emp.setName("TALLY");
		emp.setDeg("B.Tech");
		emp.setSalary(1000);
		emp.seteId(1);
		emp.setAddress(add);
		dependents.add(dep);
		dependents.add(dep1);
		emp.setDependent(dependents);
		em.persist(add);
		em.persist(emp);
		em.persist(dep);
		em.getTransaction().commit();
		//FIND ADDRESS WITH ONLY 1 PRIMARY KEY
	//	Address empFind= em.find(Address.class,1);
	//	System.out.println("NAME IS "+empFind.getName());
		Employee_Name enameFind=new Employee_Name("AA","BB");
		Address empFind2= em.find(Address.class,enameFind);
		System.out.println("EMP_NAME IS "+empFind2.getName().FirstName);
		Employee_SpouseName spname=new Employee_SpouseName("CC","DD");
		Dependents depFind=em.find(Dependents.class,spname);
		System.out.println("SPOUSE NAME IS "+depFind.FirstName);
		em.close();
		emf.close();
	}
}

package javaCampHw4___2.entities;

import java.util.Date;

import javaCampHw4___2.abstracts.Entitiy;

public class Customer implements Entitiy {
	private int id;
	private String name;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityId;
	
	public Customer(int id, String name, String lastName, Date dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.name = name;
		this.setLastName(lastName);
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	private int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDateOfBirth() {
		return dateOfBirth.getYear();
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

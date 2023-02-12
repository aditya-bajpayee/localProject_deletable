package com.employeeProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	@Column(name="gmail")
	private String gmail;

	public Employee() {
		super();
	}


	public Employee(String fname, String lname, String gmail) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gmail = gmail;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getGmail() {
		return gmail;
	}


	public void setGmail(String gmail) {
		this.gmail = gmail;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gmail=" + gmail + "]";
	}
	
	
	
	

}

package com.employeeProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rId;
	private String name;
	
	
	public Role() {
		super();
	}


	public Role(int rId, String name) {
		super();
		this.rId = rId;
		this.name = name;
	}


	public int getrId() {
		return rId;
	}


	public void setrId(int rId) {
		this.rId = rId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Role [rId=" + rId + ", name=" + name + "]";
	}

}

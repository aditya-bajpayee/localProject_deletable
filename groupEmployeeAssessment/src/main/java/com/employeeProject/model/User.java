package com.employeeProject.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uId;
	private String username;
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "users_roles" , joinColumns = @JoinColumn(name="uId"),
	inverseJoinColumns = @JoinColumn(name ="rId"))
	private List<Role> roles = new ArrayList<>();
	
	public User() {
		super();
	}


	public User(int uId, String username, String password) {
		super();
		this.uId = uId;
		this.username = username;
		this.password = password;
	}


	public int getuId() {
		return uId;
	}


	public void setuId(int uId) {
		this.uId = uId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	

	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "User [uId=" + uId + ", username=" + username + ", password=" + password + "]";
	}
	
	

	
}

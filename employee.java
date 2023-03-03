package com.example.onetomany.demo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="newemployeedetails")
public class employee {

	@Id
	private int id;
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_add_id")
	private List<address> address;
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public employee()
	{
		
	}
	public int getId() {
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

	public List<address> getAddress() {
		return address;
	}

	public void setAddress(List<address> address) {
		this.address = address;
	}
	
}

package com.webservice.generated.employee;

public class Employee {
	private String name;
	private int id;
	private String address;
	private int phone;
	private String status;
	
	public Employee(String name, int id, String address, int phone, String status) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.phone = phone;
		this.status = status;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

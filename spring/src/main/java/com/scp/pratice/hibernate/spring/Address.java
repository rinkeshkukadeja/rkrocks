package com.scp.pratice.hibernate.spring;

public class Address {

	private String city;
	private String Street;
	
	public Address(String city, String street) {
		super();
		this.city = city;
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", Street=" + Street + "]";
	}
	
	
}

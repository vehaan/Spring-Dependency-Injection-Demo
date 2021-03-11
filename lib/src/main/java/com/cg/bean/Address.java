package com.cg.bean;

public class Address {
	
	private String city;
	private String pinCode;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(String city, String pinCode, String state) {
		super();
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + ", state=" + state + "]";
	}
	
	

}

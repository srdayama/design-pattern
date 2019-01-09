package com.scp.Prototype;

public class Address1  {

	
	int pincode;
	String city;
	@Override
	public String toString() {
		return "Address1 [pincode=" + pincode + ", city=" + city + "]";
	}
	public Address1(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

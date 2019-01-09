package com.scp.Prototype;

import java.util.Date;
import java.util.List;

public class Employee  implements Cloneable{

	private int empId;
	private String ename;//system define immutable class
	private Date date; // system define mutable class
	private double salary;
	private StringBuffer elocation;// system define mutable class
	private List<String> empList;
	private Address address;
	public int getEmpId() {
		return empId;
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		Employee emp= (Employee)super.clone();
		Address adr = emp.getAddress().clone();
		emp.setAddress(adr);
		return emp; 	
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public List<String> getEmpList() {
		return empList;
	}
	public void setEmpList(List<String> empList) {
		this.empList = empList;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public StringBuffer getElocation() {
		return elocation;
	}

	public void setElocation(String elocation) {
		//return elocation;
		this.elocation = new StringBuffer(elocation);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", date=" + date + ", salary=" + salary
				+ ", elocation=" + elocation + ", empList=" + empList + ", address=" + address + "]";
	}

	public Employee(int empId, String ename, Date date, double salary, StringBuffer elocation, List<String> empList,
			Address address) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.date = date;
		this.salary = salary;
		this.elocation = elocation;
		this.empList = empList;
		this.address = address;
	}

	

}

class Address implements Cloneable{
	private int pinCode;
	private String city;
	public int getPinCode() {
		return pinCode;
		
	}
	
	@Override
	protected Address clone() throws CloneNotSupportedException {
		
		return (Address)super.clone();
	}
	
	
	
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", city=" + city + "]";
	}
	public Address(int pinCode, String city) {
		super();
		this.pinCode = pinCode;
		this.city = city;
	}
	
}
package com.college.model;

public class Person {
	private String Name;
	private int age;
	private long contactNumber;
	public Person() {
		
	}
	public Person(String Name,int age,long contactNumber) {
		this.Name=Name;
		this.age=age;
		this.contactNumber=contactNumber;
	}
	public String getName() {
		return Name;
	}
	public int getage() {
		return age;
	}
	public long getcontactNumber() {
		return contactNumber;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public void setcontactNumber(long contactNumber) {
		this.contactNumber=contactNumber;
	}
}
//1.Packages are imporatant in real time projects because they oraganize code into 
//meaningful groups,making it easier to manage and maintain large applications.They also
//help avoid class name conflicts and improve code reusability and security.

//2.Fields are kept private to protect data from being changed directly and indirectly.
//Getters and setter are used to safely access and update the data with control and validation.






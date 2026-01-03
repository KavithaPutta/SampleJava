package com.college.model;

public class Student extends Person {
	private int studentId;
	private String department;
	private String courseName;
	public Student() {
		
	}
	public Student(int studentId,String department,String courseName) {
		this.studentId=studentId;
		this.department=department;
		this.courseName=courseName;
	}
	public int getstudentId() {
		return studentId;
	}
	public String getdepartment() {
		return department;
	}
	public String getcourseName() {
		return courseName;
	}
	public void setstudentId(int studentId) {
		this.studentId=studentId;
	}
	public void setdepartment(String department) {
		this.department=department;
	}
	public void setcourseName(String courseName) {
		this.courseName=courseName;
	}
	public void displaystudentdetails() {
		System.out.println("studentId:"+getstudentId());
		System.out.println("department:"+getdepartment());
		System.out.println("courseName:"+getcourseName());
	}
	

}
//Student inherits properties from Person by using inheritance, which means Student automatically
//gets common features like name and age from Person. This avoids rewriting the same code and allows
//Student to also have its own specific details, such as Id or course.


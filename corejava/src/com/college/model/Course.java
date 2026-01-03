package com.college.model;

public class Course {
	private int courseCode;
	private String courseTitle;
	private double courseFee;
	public Course(int courseCode,String courseTitle,double courseFee) {
		this.courseCode=courseCode;
		this.courseTitle=courseTitle;
		this.courseFee=courseFee;
	}
	public int getcourseCode() {
		return courseCode;
	}
	public String getcourseTitle() {
		return courseTitle;
	}
	public double getcourseFee() {
		return courseFee;
	}
	public void setcourseCode(int courseCode) {
		this.courseCode=courseCode;
	}
	public void setcourseTitle(String courseTitle) {
		this.courseTitle=courseTitle;
	}
	public void setcourseFee(double courseFee) {
		this.courseFee=courseFee;
	}



}
//Constructors are required to initialize objects because they set initial values for an object’s data 
//when it is created, making sure the object starts in a valid and usable state.


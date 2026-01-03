package com.college.service;


public class StudentService {
	public double calculateDiscountedFee(double Fee,double discountpercent,String department) {
		if(department.equals("IT")) {
			 Fee=Fee*0.90;
		}else {
		System.out.println("No Discount Applied");
	}
		return Fee;
	
	}	

}
//Business logic is written in a separate class to keep the code clean and organized, make it easier
//to understand and maintain, and allow changes without affecting other parts like input or output.


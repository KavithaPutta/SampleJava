package com.Test;
import java.util.Scanner;



class Employee {
	private String EmployeeName;
	private String EmployeeId;
	private String department;
	
	public Employee(String EmployeeName,String EmployeeId,String department) {
		this.setEmployeeName(EmployeeName);
		this.setEmployeeId(EmployeeId);
		this.setDepartment(department);
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.EmployeeName = employeeName;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.EmployeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

}

class ProjectEmployee extends Employee{
	String projectName;
	String projectrole;
	int size=3;
	int arr[]=new int[size];
	
	
	public ProjectEmployee(String EmployeeName, String EmployeeId, String department, String projectName,String projectrole) {
		super(EmployeeName, EmployeeId, department);
		this.projectName=projectName;
		this.projectrole=projectName;
	}
	public String getprojectName() {
		return  projectName;
	}

	public void setprojectName(String  projectName) {
		this. projectName =  projectName;
	}
	public String getprojectrole() {
		return projectrole;
	}

	public void setprojectrole(String projectrole) {
		this.projectrole = projectrole;
	}
	 public void EmployeeDetails() {
		 System.out.println("Employee Details");
		 System.out.println("Name:"+getEmployeeName());
		 System.out.println("Employee ID:"+getEmployeeId());
		 System.out.println("Department:"+getDepartment());
		 System.out.println("Project Name:"+projectName);
		 System.out.println("Project Role:"+projectrole);
	 }
	public void updateRole(String projectrole) {
		System.out.println(projectrole);
	}
	public void updateName(String projectName) {
		System.out.println(projectName);
	}
}
public class Example{
 public static void main(String [] args) {
      Scanner sc=new Scanner(System.in)	;
      System.out.println("Enter Employee Name:");
      String EmployeeName=sc.nextLine();
      System.out.println("Enter Employee ID:");
      String EmployeeId=sc.nextLine();
      System.out.println("Enter Department:");
      String department=sc.nextLine();
      System.out.println("Enter Project Name:");
      String projectName=sc.nextLine();
      System.out.println("Enter Project Role:");
      String projectrole=sc.nextLine();
	 
	  ProjectEmployee obj=new ProjectEmployee(EmployeeName, EmployeeId, department, projectName, projectrole);
	  
	  System.out.println("Employee Details");
		 System.out.println("Name:"+EmployeeName);
		 System.out.println("Employee ID:"+EmployeeId);
		 System.out.println("Department:"+department);
		 System.out.println("Project Name:"+projectName);
		 System.out.println("Project Role:"+projectrole);
		 System.out.println("-------");
	  boolean select=true;
      while(select) {
      	System.out.println("Menu Operations:");
          System.out.println("1.update Project Role");
          System.out.println("2.Update Project Name");
          System.out.println("3.View Employee Profile");
          System.out.println("4.View Average Performance score");
          System.out.println("5. Exit");
          System.out.println("Enter Choice:");
          String option=sc.next();
      
      if(option.equals("1")) {
    	  System.out.println("Update Project role:");
    	  obj.updateRole("Frontend");
      	
      }
      else if(option.equals("2")) {
    	  System.out.println("Update Project Name:");
    	  
    	  
    	  obj.updateName("Food App");
      	
      }
      else if(option.equals("3")) {
    	  System.out.println("Employee Profile Created");
      	  obj.EmployeeDetails();
      }
      else if(option.equals("4")) {
    	  System.out.println("Average Performace");
      }
      else {
      	select=false;
      	System.out.println("Thankyou !");
      }
	}
	  
	  
  }
  
 
}
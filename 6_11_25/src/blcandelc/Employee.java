package blcandelc;

public class Employee {
	int empId;
	String empName;
	double empSalary;
	public int getempId() {
		return empId;
	}
	public String getempName() {
		return empName;
	}
	public double getempSalary() {
		return empSalary;
	}
	public void setempId(int Empid) {
		empId=Empid;
	}
	public void setempName(String Empname) {
		empName=Empname;
	}
	public void setempSalary(double salary) {
		empSalary=salary;
	}
	public static Employee getEmployeeDetails(int empId,String empName,double empSalary ) {
	Employee obj=new Employee();
		obj.setempName(empName);
		obj.setempId(empId);
		obj.setempSalary(empSalary);
		return obj;
	}
	

}

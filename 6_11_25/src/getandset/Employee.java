package getandset;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;
	public int getemployeeId() {
		return employeeId;
	}
	public String getemployeeName() {
		return employeeName;
	}
	public double getsalary() {
		return salary;
	}
	public void setemployeeId(int Employeeid) {
		employeeId=Employeeid;
	}
	public void setemployeeName(String Employeename) {
		employeeName=Employeename;
	}
	public void setsalary(double Salary) {
		salary=Salary;
	}
	public String displayDetails() {
		return "employeeId:"+employeeId+"employeeName:"+employeeName+"salary:"+salary;	
	}

}

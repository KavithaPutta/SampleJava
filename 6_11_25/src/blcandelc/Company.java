package blcandelc;

public class Company {
	public static void main(String[] args) {
		Employee obj1=Employee.getEmployeeDetails(7, "Kavitha", 40000);
		System.out.println(obj1.getempId());
		System.out.println(obj1.getempName());
		System.out.println(obj1.getempSalary());
		
	}

}

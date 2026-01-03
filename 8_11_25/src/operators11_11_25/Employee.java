package operators11_11_25;

public class Employee {
	String Name;
	double Salary;

	public void increaseSalary(Employee e) {
		Salary=Salary+Salary*10;
	}

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.Name="Kavitha";
		obj.Salary=50000.0;
		
		obj.increaseSalary(obj);
		System.out.println("updated salary:"+obj.Salary);

	}

	}

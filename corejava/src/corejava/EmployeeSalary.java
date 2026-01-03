package corejava;

public class EmployeeSalary {
	static int basic=20000;
	static int bonus=5000;
	public static void calculateSalary() {
		System.out.println("Total Salary:"+(basic+bonus));
	}

	public static void main(String[] args) {
		calculateSalary();
		

	}

}

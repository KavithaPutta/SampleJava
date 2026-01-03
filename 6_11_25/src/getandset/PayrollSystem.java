package getandset;

public class PayrollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.setemployeeId(52);
		obj.setemployeeName("Kavitha");
		obj.setsalary(50000);
		System.out.println(obj.displayDetails());
		System.out.println("--------------------");
		obj.setsalary(55000);
		System.out.println(obj.displayDetails());
		

	}

}

package operators11_11_25;

public class Student {
	String name;
	int marks;
	public class displaydetails{
		public static void printDetails(Student s) {
			System.out.println("student Name:"+ s.name);
			System.out.println("Student marks:"+s.marks);
		}
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.name="Kavitha";
		obj.marks=92;
	displaydetails.printDetails(obj);

	}

}

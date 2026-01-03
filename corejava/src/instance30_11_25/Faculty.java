package instance30_11_25;

public class Faculty {
	static String universityName="Stanford University";
	String facultyName;
	String department;
	public void showFacultyDetails() {
		System.out.println("University Name:"+universityName);
		System.out.println("Faculty Name:"+facultyName);
		System.out.println("Department:"+department);
		
	}

	public static void main(String[] args) {
		Faculty obj1=new Faculty();
		Faculty obj2=new Faculty();
		obj1.facultyName="Dr.Robert Brown";
		obj1.department="Computer Science";
		obj2.facultyName="Dr.Lisa green";
		obj2.department="ECE";
		obj1.showFacultyDetails();
		System.out.println("----------");
		obj2.showFacultyDetails();

	}

}





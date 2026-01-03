package blcandelc;

public class Student {
	int StudentId;
	String Name;
	int rollno;
	public int getStudentId() {
		return StudentId;
	}
	public String getName() {
		return Name;
	}
	public int getrollno() {
		return rollno;
	}
	public void setStudentId(int id) {
		StudentId=id;
	}
	public void setName(String name) {
		Name=name;
	}
	public void setrollno(int Rollno) {
		rollno=Rollno;
	}
	public static Student getStudentDetails(int StudentId,String Name,int rollno ) {
	Student obj=new Student();
		obj.setName(Name);
		obj.setStudentId(StudentId);
		obj.setrollno(rollno);
		return obj;
	}
	


}

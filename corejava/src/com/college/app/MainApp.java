package com.college.app;
import java.util.*;
import com.college.model.Person;
import com.college.model.Student;
import com.college.model.Course;
import com.college.service.StudentService;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String Name=sc.next();
		System.out.println("Enter Student age:");
		int age=sc.nextInt();
		System.out.println("Enter Contact number:");
		long contactNumber=sc.nextLong();
		System.out.println("Enter StudentId:");
		int studentId=sc.nextInt();
		System.out.println("Enter Department:");
		String department=sc.next();
		System.out.println("Enter Course Name:");
		String courseName=sc.next();
		System.out.println("Enter Course Fee:");
		double fee=sc.nextDouble();
		Person obj=new Person(Name,age,contactNumber);
		System.out.println("Student Name:"+obj.getName());
		System.out.println("Student Age:"+obj.getage());
		System.out.println("Student Number:"+obj.getcontactNumber());
		Student st=new Student( studentId, department, courseName);
		st.displaystudentdetails();
		Course c=new Course(23,"B.tech",fee);
		
		StudentService service=new StudentService();
		double finalFee=service.calculateDiscountedFee(fee, fee, department);
		
		System.out.println("original fee:"+fee);
		double discount=fee-finalFee;
		System.out.println("Discount Applied:"+discount);
		System.out.println("Final Payable Fee:"+(fee-discount));
	}

}
//Scanner is used instead of hard-coded values so the program can take input from the user at runtime, 
//making it flexible and reusable instead of fixed to one value.

//1.Encapsulation means keeping data private and accessing it through methods. In this assignment,
//it is used by making variables private in the class and using getters and setters to access them safely.

//2. We created a Person class as a parent class to store common details like name and age, 
//which can be shared by other classes like Student.

//3.Inheritance reduces code duplication by allowing a child class to reuse the code of a parent class
//instead of writing the same code again.

//4. We should not hard-code values because it makes the program inflexible. Taking input at runtime 
//makes the program reusable and easy to update.

//5.Project structure is important in Java because it keeps files organized, improves readability, 
//and makes the project easier to manage and maintain.

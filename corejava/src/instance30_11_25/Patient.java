package instance30_11_25;

public class Patient {
	static String hospitalName="City Care Hospital";
	String Name;
    int age;
	public void printDetails() {
		System.out.println("Hospital Name:"+hospitalName);
		System.out.println("Name:"+Name);
		System.out.println("Age:"+age);
		
	}

	public static void main(String[] args) {
		Patient obj1=new Patient();
		Patient obj2=new Patient();
		obj1.Name="John Doe";
		obj1.age=45;
		obj2.Name="Emma Watson";
		obj2.age=30;
		obj1.printDetails();
		System.out.println("----------");
		obj2.printDetails();

	}

}





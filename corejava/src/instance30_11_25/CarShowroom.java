package instance30_11_25;

public class CarShowroom {
	static String showroomName="Elite Motors";
	String modelName;
	int price;
	public void displaydetails() {
		System.out.println("ShowroomName:"+showroomName);
		System.out.println("ModelName:"+modelName);
		System.out.println("Price:"+price);
		
	}

	public static void main(String[] args) {
		CarShowroom obj1=new CarShowroom();
		CarShowroom obj2=new CarShowroom();
		obj1.modelName="Tesla Model S";
		obj1.price=80000;
		obj2.modelName="BMW X5";
		obj2.price=75000;
		obj1.displaydetails();
		System.out.println("----------");
		obj2.displaydetails();

	}

}

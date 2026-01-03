package getandset;

public class CarRentalService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1=new Car();
		Car obj2=new Car();
		obj1.setcarId(66);
		obj1.setbrand("Audi");
		obj1.setmodel("Audi A6");
		obj1.setrentalPricePerDay(90000);
		obj2.setcarId(54);
		obj2.setbrand("Sedan");
		obj2.setmodel("luxuary");
		obj2.setrentalPricePerDay(1200000);
		System.out.println(obj1.displayDetails());
		System.out.println(obj2.displayDetails());

	}

}

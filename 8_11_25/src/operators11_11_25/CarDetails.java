package operators11_11_25;

public class CarDetails {
	String brand;
	double Price;
	public class Showroom{
	public void displayCar(CarDetails c) {
		System.out.println("Car brand:"+brand);
		System.out.println("Car Price:"+Price);
	}
		
	}

	public static void main(String[] args) {
		CarDetails obj=new CarDetails();
		obj.brand="tesla";
		obj.Price=75000.5;
		Showroom s=obj.new Showroom();
	    s.displayCar(obj);
		
	}

}

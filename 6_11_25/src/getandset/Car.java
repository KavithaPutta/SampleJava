package getandset;

public class Car {
	int carId;
	String brand;
	String model;
	double rentalPricePerDay;
	public int getcarId() {
		return carId;
	}
	public String getbrand() {
		return brand;
	}
	public String getmodel() {
		return model;
	}
	public double getrentalPricePerDay() {
		return rentalPricePerDay;
	}
	public void setcarId(int Carid) {
		carId=Carid;
	}
	public void setbrand(String Brand) {
		brand=Brand;
	}
	public void setmodel(String Model ) {
		model=Model;
	}
	public void setrentalPricePerDay(double Price) {
		rentalPricePerDay=Price;
	}
	public String displayDetails() {
		return "carId:"+carId+"brand:"+brand+"model:"+model+"rentalPricePerDay:"+rentalPricePerDay;	
	}

}

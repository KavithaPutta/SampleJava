package instance30_11_25;

public class Mobile {
	static String StoreName="Tech World";
	String Brand;
	int price;
	public void showDetails() {
		System.out.println("Store Name:"+StoreName);
		System.out.println("Brand:"+Brand);
		System.out.println("Price:"+price);
		
	}

	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		Mobile obj2=new Mobile();
		obj1.Brand="Apple";
		obj1.price=1200;
		obj2.Brand="Samsung";
		obj2.price=900;
		obj1.showDetails();
		System.out.println("----------");
		obj2.showDetails();

	}

}





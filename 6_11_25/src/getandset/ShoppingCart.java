package getandset;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 obj1=new Product1();
		Product1 obj2=new Product1();
		obj1.setproductId(14);
		obj1.setproductName("Laptop");
		obj1.setprice(50000);
		obj1.setquantity(1);
		System.out.println(obj1.displayDetails());
		System.out.println("-------------------");
		obj1.setquantity(6);
		System.out.println(obj1.displayDetails());
		System.out.println("-------------------");
		obj2.setproductId(52);
		obj2.setproductName("Mobile");
		obj2.setprice(20000);
		obj2.setquantity(2);
		System.out.println(obj2.displayDetails());
		System.out.println("-------------------");
		obj2.setquantity(12);
		System.out.println(obj2.displayDetails());
	}



	}



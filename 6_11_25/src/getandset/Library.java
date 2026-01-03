package getandset;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj1=new Book();
		Book obj2=new Book();
		obj1.setbookId(34);
		obj1.settitle("ramayanam");
		obj1.setauthor("valmiki");
		obj1.setprice(500);
		obj2.setbookId(52);
		obj2.settitle("mahabharatham");
		obj2.setauthor("Tulasidas");
		obj2.setprice(600);
		System.out.println(obj1.displayDetails());
		System.out.println(obj2.displayDetails());
		

	}

}

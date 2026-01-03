package operators;

public class ProductPrices {
	 double a=30;
	 double b=50;
	 double c=90;
	 double d=a+b+c;
	 public void TotalPrice() {
		 System.out.println(d);
	 }
	 public void Average() {
		 System.out.println(a+b+c/3);
	 }
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductPrices obj=new ProductPrices();
		obj.TotalPrice();
		obj.Average();

	}

}

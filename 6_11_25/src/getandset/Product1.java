package getandset;

public class Product1 {
		int productId;
		String productName;
		double price;
		int quantity;
		public int getproductId(){
		return productId;
		}
		public String getproductName(){
		return productName;
		}
		public double getprice(){
		return price;
		}
		public int getquantity(){
		return quantity;
		}
		public void setproductId(int Productid){
		productId=Productid;
		}
		public void setproductName(String Productname){
		productName=Productname;
		}
		public void setprice(double productprice){
		price=productprice;
		}
		public void setquantity(int Quantity){
		quantity=Quantity;
		}
		public String displayDetails(){
		return "productId:"+productId+"productName:"+productName+"price:"+price+"quantity:"+quantity;
		}
}

	

	



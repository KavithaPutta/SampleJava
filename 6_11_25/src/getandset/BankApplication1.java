package getandset;

public class BankApplication1 {

	public static void main(String[] args) {
	
		BankApplication obj=new BankApplication();
		obj.setaccountNumber(234567890134345l);
		obj.setaccountHolderName("Kavitha");
		obj.setbalance(675.00);
		System.out.println(obj.displayDetails());
		System.out.println("-----------------------");
		obj.setbalance(5000.0);
		System.out.println(obj.displayDetails());
	}

}

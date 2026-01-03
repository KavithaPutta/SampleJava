package corejava;

public class CurrencyConverter {
	static double dollarRate=84.5;
	public static void convertToINR(double usd) {
			double inr=usd *dollarRate;
			System.out.println(usd + " USD = " + inr + " INR");
		}
		
	

	public static void main(String[] args) {
		convertToINR(84.5);
		convertToINR(47.0);
		convertToINR(19.0);
		
		

	}

}

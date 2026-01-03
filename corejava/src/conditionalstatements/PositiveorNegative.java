package conditionalstatements;

public class PositiveorNegative {
	public String checkNumber(int num) {
		if(num>0) {
			return "Positive";
		}
		if(num<0) {
			return "negative";
		}
		if(num==0) {
			return "equal";
		}
		return null;
	}

	public static void main(String[] args) {
		PositiveorNegative obj=new PositiveorNegative();
		System.out.println("Check -5: " + obj.checkNumber(-5));
		
		

	}

}

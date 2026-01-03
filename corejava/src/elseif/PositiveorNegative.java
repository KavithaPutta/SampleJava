package elseif;

public class PositiveorNegative {
	public String isPositive(int num) {
		if(num>0) {
			return "num is Positive";
		}
		else {
			return "num is Negative";
		}
	}

	public static void main(String[] args) {
		 PositiveorNegative obj=new  PositiveorNegative();
		 String result=obj.isPositive(2);
		 System.out.println(result);
		
		

	}

}

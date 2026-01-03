package conditionalstatements;

public class GreaterNumber {
	public int findGreater(int num1,int num2) {
		if(num1>num2) {
			return num1;
		}
		if(num1<num2) {
			return num2;
		}
		return num1;
	}

	public static void main(String[] args) {
		GreaterNumber obj=new GreaterNumber();
		System.out.println("Greater number (25, 10): " + obj.findGreater(25, 10));
		
		
	}

}

package conditionalstatements;

public class Example1 {
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
		

	    public static void main(String[] args) {
		    Example1 obj=new Example1();
		    boolean result=obj.isEven(10);
		    System.out.println(result);
		
		

	}

}

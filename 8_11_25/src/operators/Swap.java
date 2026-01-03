package operators;

public class Swap {
	int a=10;
	int b=30;
	public void SwapTwoNumbers() {
		a=b;
		b=a;
		System.out.println(a+b);
		System.out.println(a-b);
		
	}
	public static void main(String[] args) {
		Swap obj=new Swap();
		obj.SwapTwoNumbers();
		
	}

}

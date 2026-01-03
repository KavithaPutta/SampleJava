package operators;

public class ArithmaticOperations {
	int a=40;
	int b=30;
	public void addition() {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
			
		}
		public static void main(String[] args) {
		ArithmaticOperations obj=new ArithmaticOperations();
		obj.addition();
		}

}

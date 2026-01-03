package operators;

public class UnaryOperator {
	public void OperatorDemo() {
		int a=1;
		System.out.println(a);
		int x=a++;
		System.out.println(x);
		int b=30;
		int y=b++;
		System.out.println(b);
		System.out.println(y);
		int c=5;
		int result=c+ c++;
		System.out.println(result);
		int d=6;
		System.out.println(d++ + ++d + d++);
		int k=2;
		System.out.println(k++ + ++k + k-- + +k - k++);
	}

	public static void main(String[] args) {
		UnaryOperator obj=new UnaryOperator();
		obj.OperatorDemo();
		}
}

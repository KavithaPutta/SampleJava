package operators;

public class LogicalOperators {
	public void data() {
		int a=1;
		System.out.println(false && ++a==2);
		System.out.println(a);
		int b=3;
		System.out.println(true && ++b==b++);
		System.out.println(b);
		System.out.println(true==true || false==false);
		System.out.println(true&&false&&false);
		System.out.println((true||true)&&false);
		System.out.println(true ||false||false);
		int x=30;
		System.out.println((false || ++x==x++)&&(x++==++x));
		System.out.println(x);
	}

	public static void main(String[] args) {
		LogicalOperators obj=new LogicalOperators();
		obj.data();
	

	}

}

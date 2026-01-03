package operators;

public class Returnmethod {
	int a=30;
	int b=50;
	public int addition() {
		return a+b;
	}
	public static void main(String[] args) {
		Returnmethod obj=new Returnmethod();
		System.out.println(obj.addition());
	}

}

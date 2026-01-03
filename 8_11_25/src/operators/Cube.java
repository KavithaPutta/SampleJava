package operators;

public class Cube {
	int a=24;
	
	public void Square() {
		int b=a*a;
		System.out.println(b);
	}
	public void Cubic() {
		System.out.println(a*a*a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube obj=new Cube();
		obj.Square();
		obj.Cubic();

	}

}

package operators;

public class Marks {
	int a=50;
	int b=70;
	int c=85;
	int d=a+b+c;
	public void Average() {
		System.out.println(a+b+c/3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks obj=new Marks();
		obj.Average();
		

	}

}

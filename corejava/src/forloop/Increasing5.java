package forloop;

public class Increasing5 {
	public void Numbers5To50() {
		for(int i=5;i<=50;i+=5) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Increasing5 obj=new Increasing5 ();
		obj.Numbers5To50();

	}

}

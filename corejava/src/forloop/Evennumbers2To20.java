package forloop;

public class Evennumbers2To20 {
	public void Evennumber() {
		for (int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Evennumbers2To20 obj=new Evennumbers2To20();
		obj.Evennumber();

	}

}

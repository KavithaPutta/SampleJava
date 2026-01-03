package forloop;

public class OddNumbers1To15 {
	public void Oddnumbers() {
		for(int i=1;i<=15;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		OddNumbers1To15 obj=new OddNumbers1To15();
		obj.Oddnumbers();

	}

}

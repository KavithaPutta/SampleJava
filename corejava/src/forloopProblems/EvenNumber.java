package forloopProblems;

public class EvenNumber {
	public void getEven() {
		for(int i=1;i<=200;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}

	public static void main(String[] args) {
		EvenNumber obj=new EvenNumber();
		obj.getEven();

	}

}

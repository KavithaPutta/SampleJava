package forloopProblems;

public class OddNumber {
	public void getOdd() {
		for(int i=1;i<=200;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		OddNumber obj=new OddNumber();
		obj.getOdd();

	}

}

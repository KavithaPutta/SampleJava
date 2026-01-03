package forloopProblems;

public class Division {
	public void divisionof3To5() {
		for(int i=100;i>=1;i--) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Division obj=new Division();
		obj.divisionof3To5();

	}

}

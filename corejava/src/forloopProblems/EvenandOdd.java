package forloopProblems;

public class EvenandOdd {
	public void numbers() {
		String num="Even number:";
		System.out.print(num);
		for(int i=1;i<=200;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
	    System.out.print("\nodd numbers:");
				for(int i=1;i<=200;i++) {
					if(i%2!=0) {
						System.out.print(i+" ");
					}
				}
			}
	public static void main(String[] args) {
		EvenandOdd obj=new EvenandOdd();
		obj.numbers();
		

	}

}

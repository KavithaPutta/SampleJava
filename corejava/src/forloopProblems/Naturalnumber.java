package forloopProblems;

public class Naturalnumber {
	public int getsumofNaturalnumbers(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Naturalnumber obj=new Naturalnumber();
		System.out.println(obj.getsumofNaturalnumbers(10));

	}

}

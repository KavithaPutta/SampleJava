package controlstatements;

public class PrimeNumber {
	public boolean IsPrime(int num) {
	int count=0;
	for (int i=1;i<=5;i++) {
		if(num % i==0) {
			count++;
		}
	}
	return count==2;
		
	}

	public static void main(String[] args) {
		PrimeNumber obj=new PrimeNumber();
		System.out.println((obj.IsPrime(4))?"Prime":"Not a Prime");
		

	}

}

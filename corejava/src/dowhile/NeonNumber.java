 package dowhile;

public class NeonNumber {
	public boolean neonnum(int num) {
		int square=num*num;
		int sum=0;
		while(square>0){
			int rem=square%10;
			sum=sum+rem;
			square/=10;
		}
		return sum==num;
	}
	

	public static void main(String[] args) {
		NeonNumber obj=new NeonNumber();
		boolean result=obj.neonnum(9);
		System.out.println(result?"neon":"!neon");
		}
	

	}

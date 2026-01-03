package harshadnumber;

public class HarshadNum {
	public static boolean isHarshadNumber(int num) {
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		return (temp%sum==0);
	}

	public static void main(String[] args) {
		System.out.println(isHarshadNumber(24)?"Harshad Number":"!Harshad");
	}

}
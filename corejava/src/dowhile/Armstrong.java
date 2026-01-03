package dowhile;

public class Armstrong {
	public int getpower(int base, int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
		}
		return power;
	}
	public int getcount(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
	public boolean getsum(int num) {
		int count=getcount(num);
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+getpower(rem,count);
			num/=10;
		}
		return sum==temp;
	}
	public static void main(String[] args) {
		Armstrong obj=new Armstrong();
		System.out.println(obj.getsum(153)?"Armstrong":"!Armstrong");
		

	}

}

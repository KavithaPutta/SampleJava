package whileloop;

public class ReverseNumber {
	public void reversenumber(int num) {
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		ReverseNumber obj=new ReverseNumber();
		 obj.reversenumber(1904);

	}

}
 
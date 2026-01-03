package harshadnumber;

public class UglyNum {
	public static boolean uglynumber(int num) {
		if(num<=0) {
			return false;
		}
		while(num>0) {
			if(num%2==0) {
				num=num/2;
			}
			else if(num%3==0){
				num=num/3;
			}
			else if(num%5==0) {
				num=num/5;
			}
			else {
				break;
			}
		}
		return num==1;
	}

	public static void main(String[] args) {
		System.out.println(uglynumber(12)?"ugly number":"!ugly number");

	}

}

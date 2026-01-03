package elseif;

public class Largest {
	public String findlargestnumber(int a,int b, int c) {
		if((a>b)&&(a>c)) {
			return "A is Large";
			}
		else {
			if((b>a)&&(b>c)) {
				return"B is Large";
			}
			else {
				return "C is big";
			}
		}
	}

	public static void main(String[] args) {
		Largest obj=new Largest();
		System.out.println(obj.findlargestnumber(10,40,30));

	}

}

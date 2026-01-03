package elseif;

public class Evenorodd {
	public boolean CheckNumber(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Evenorodd obj=new Evenorodd();
		System.out.println(obj.CheckNumber(20));
		
		

	}

}

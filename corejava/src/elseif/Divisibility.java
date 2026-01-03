package elseif;

public class Divisibility {
	public String Divisible(int num) {
		if((num%5==0)&&(num%11==0)){
			return"Divisible for both 5 and 11";
			
		}
		else {
			return"not Divisible";
		}
	}

	public static void main(String[] args) {
		Divisibility obj=new Divisibility();
		System.out.println(obj.Divisible(55));
		
		

	}

}

package elseif;

public class Eligibility {
	public String isEligibilitytovote(int age) {
		if(age>=18) {
			return "Eligibility to vote";
		}
		else {
			return"not Eligible";
		}
	}

	public static void main(String[] args) {
		Eligibility obj=new Eligibility();
		System.out.println(obj.isEligibilitytovote(19));
		
		

	}

}

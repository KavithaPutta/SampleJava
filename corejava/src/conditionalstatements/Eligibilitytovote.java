package conditionalstatements;

public class Eligibilitytovote {
	public boolean canVote(int age) {
		if (age>=18) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Eligibilitytovote obj=new Eligibilitytovote();
		System.out.println("Can vote (Age 20)? " + obj.canVote(20));
		

	}

}

package ladderif;

public class UnivresityAdmission {
	public String evaluateAdmission(int marks,boolean sportAchievement) {
		if(marks>=95) {
			return "Admitted with Scholarship";
		}
		else if(marks>=85 && marks<94) {
			return "Admitted without Scholarship";
		}
		else if(marks>=70 && marks<84) {
			return "Admitted in Sports Quota";
		}
		else if(marks>=60 && marks<=69) {
			return "Interview Required";
		}
		else {
			return "Admission Rejected";
		}
	}
	public static void main(String[] args) {
		 UnivresityAdmission obj=new  UnivresityAdmission();
		 System.out.println(obj.evaluateAdmission(78, false));
		

	}

}

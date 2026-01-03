package ladderif;

public class LoanApproval {
	public String checkLoanApproval(double salary,int creditScore) {
		if((salary>80000) && (creditScore>750)) {
			return "Loan Approved Immediately";
		}
		else if((salary<=80000)&&(salary>=50000)&&(creditScore<=750)&&(creditScore>=650)){
			return "Loan Approved with Higher Interst Rate";
		}
			else if((salary<50000)&&(salary>=30000)&&(creditScore<650)&&(creditScore>=500)) {
				return "Co-signer Required";
				}
			else {
				return "Loan Rejected";
			}
	}
        public static void main(String[] args) {
		LoanApproval obj=new LoanApproval();
		System.out.println(obj.checkLoanApproval(70000, 650));
		
		
	}
	}



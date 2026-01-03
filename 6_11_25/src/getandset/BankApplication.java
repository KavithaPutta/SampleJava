package getandset;

public class BankApplication {
	long accountNumber;
	String accountHolderName;
	double balance;
	public long getaccountNumber() {
		return accountNumber;
	}
    public String getaccountHolderName() {
    	return accountHolderName;
    }
    public double getbalance() {
    	return balance;
    }
    public void setaccountNumber(long Accountnumber) {
    	accountNumber=Accountnumber;
    }
    public void setaccountHolderName(String Accountholdername) {
    	accountHolderName=Accountholdername;
    }
    public void setbalance(double Balance) {
    	balance=Balance;
    }
    public String displayDetails() {
    	return "accountNumber:"+accountNumber+"accountHolderName:"+accountHolderName+"balance:"+balance;
    }
}

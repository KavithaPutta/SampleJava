package Scannerclass;

public class Bank {
	String customerName;
	String customerAddress;
	long phoneNumber;
	double balance;
	public Bank(String customerName, String customerAddress, long phoneNumber, double balance) {
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
		System.out.println("Account created Successfully");
	}
	public void deposit(double amount) {
		if(balance<=0) {
			System.out.println("Your amount is deposited");
		}else {
			balance=balance+amount;
			System.out.println("Amount to your account.your current balance is"+balance);
		}
	}
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withdraw amount");
		}
		else if(amount>balance){
			System.out.println("Insufficient Funds");
		}else {
			balance=balance-amount;
			System.out.println("withdrawl is Successful");
			System.out.println("Your remaining Balance is"+balance);
		}
	}
	public void showBalance() {
		System.out.println("your current balance is"+balance);
	}
}



package Scannerclass;
import java.util.*;
public class Bankdetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String customerName=sc.next();
		System.out.println("Enter your Address:");
		String customerAddress=sc.next();
		System.out.println("Enter Your phoneNumber:");
		long phoneNumber=sc.nextLong();
        System.out.println("Enter your Balance:");
        double balance=sc.nextDouble();
        Bank obj=new Bank(customerName,customerAddress,phoneNumber,balance);
        boolean select=true;
        while(select) {
        	System.out.println("**Select an option below**");
        	System.out.println("1.withdraw");
        	System.out.println("2.Deposit");
        	System.out.println("3.Show Balnce");
        	System.out.println("4.Exit");
        	String option=sc.next();
        	
        	if(option.equals("1")) {
        		System.out.println("Enter Withdraw Amount:");
        		double amount=sc.nextDouble();
        		obj.withdraw(amount);
        	}
        	else if(option.equals("2")) {
        		System.out.println("Enter deposit Amount:");
        		double amount=sc.nextDouble();
        		obj.deposit(amount);
        	}
        	else if(option.equals("3")) {
        		obj.showBalance();
        	}
        	else {
        		select=false;
        		System.out.println("ThankYou !");
        	}
	}
	}
}

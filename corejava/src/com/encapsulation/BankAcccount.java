package com.encapsulation;
public class BankAcccount {
        private String accountHolderName;
	    private double balance;
        public void setAccountHolderName(String name) {
	        accountHolderName = name;
	    }
        public String getAccountHolderName() {
	        return accountHolderName;
	    }

	   public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Amount Deposited: " + amount);
	        }
	    }
	   public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Amount Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }
	   public double getBalance() {
	        return balance;
	    }
	   public static void main(String[] args) {
	        BankAcccount account = new BankAcccount();
	        account.setAccountHolderName("Kavitha");
	        account.deposit(5000);
	        account.withdraw(2000);
	        System.out.println("Account Holder: " + account.getAccountHolderName());
	        System.out.println("Current Balance: " + account.getBalance());
	    }
	}



package com.packages;

public class Book {
	private int bookId;
	private String booktitle;
	private int availablecopies;
	public Book(int bookId,String booktitle,int availablecopies) {
		this.bookId=bookId;
		this.booktitle=booktitle;
		this.availablecopies=availablecopies;
		}
	public int getbookId() {
		return bookId;
	}
	public String getbooktitle() {
		return booktitle;
	}
	public int getavailablecopies() {
		return availablecopies;
	}
	public void borrowbook() {
		if(availablecopies!=0) {
			availablecopies-=1;
			System.out.println("Attempting to borrow a book");
			System.out.println("Book Borrowed Successfully Updated a  Available book"+availablecopies);
	}else {
		System.out.println("Book is not available ");
	}
	}
	public String returnbook() {
		availablecopies++;			
        System.out.println("Attempting to return a book...");
        return "Book returned successfully! updated" +availablecopies; 
		
	}
	

}

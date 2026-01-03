package com.packages;
import com.packages.Book;

public class Bookobject {
	public static void main(String[] args) {
		Book obj=new Book(101,"Harry potter",2);
		System.out.println(obj.getbookId());
		System.out.println(obj.getbooktitle());
		System.out.println(obj.getavailablecopies());
		for(int i=1;i<=5;i++) {
			if(i<=3) {
			obj.borrowbook();	
			}else {
				System.out.println(obj.returnbook());
		}
	   }
	}
}



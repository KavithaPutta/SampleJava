package getandset;

public class Book {
	int bookId;
	String title;
	String author;
	double price;
	public int getbookId() {
		return bookId;
	}
	public String gettitle() {
		return title;
	}
	public String getauthor() {
		return author;
	}
	public double getprice() {
		return price;
	}
	public void setbookId(int Bookid) {
		bookId=Bookid;
	}
	public void settitle(String Title) {
		title=Title;
	}
	public void setauthor(String Author) {
		author=Author;
	}
	public void setprice(double Price) {
		price=Price;
	}
	public String displayDetails() {
		return "bookId:"+bookId+"title:"+title+"author:"+author+"price:"+price;	
	}

}




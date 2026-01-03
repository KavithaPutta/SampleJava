package operators11_11_25;

public class Book {
	String title;
	String author;
	public class Library{
		public void addBook(Book b) {
			System.out.println("Book added:"+title+":"+author);
		}
	}

	public static void main(String[] args) {
		Book obj=new Book();
		obj.title="Java";
		obj.author="The Complete Reference by Herbert Schildt";
		Library L=obj.new Library();
		L.addBook(obj);
		

	}

}

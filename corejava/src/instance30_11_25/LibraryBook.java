package instance30_11_25;

public class LibraryBook {
	static String libraryName="City Public Library";
	String title;
	String author;
	public void displayInfo() {
		System.out.println("LibraryName:"+libraryName);
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		
	}

	public static void main(String[] args) {
		LibraryBook obj1=new LibraryBook();
		LibraryBook obj2=new LibraryBook();
		obj1.title="The Great Gatsby";
		obj1.author="Scott Fitzgerald";
		obj2.title="1984";
		obj2.author="George OrWell";
		obj1.displayInfo();
		System.out.println("----------");
		obj2.displayInfo();

	}

}


	
package arrayobject;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
//		for(int i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("book1", "Lee");
		library[1] = new Book("book2", "Lee");
		library[2] = new Book("book3", "Lee");
		library[3] = new Book("book4", "Lee");
		library[4] = new Book("book5", "Lee");
		
		for(Book book: library) {
			System.out.println(book);
			book.showInfo();
		}
	}

}

package arrayobject;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("book1", "Lee");
		library[1] = new Book("book2", "Lee");
		library[2] = new Book("book3", "Lee");
		library[3] = new Book("book4", "Lee");
		library[4] = new Book("book5", "Lee");
		
		// �ּҰ� ���� ���� ����
		
		
//		System.out.println("== library ==");
//		for(Book book: library) {
//			System.out.println(book);
//			book.showInfo();
//		}
//		
//		System.out.println("== copy library ==");
//		for(Book book: copyLibrary) {
//			System.out.println(book);
//			book.showInfo();
//		}
		
		library[0].setAuthor("Kim");
		library[0].setTitle("����");
		
		System.out.println("== library ==");
		for(Book book: library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== copy library ==");
		for(Book book: copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}

}

package arraylist;

import java.util.ArrayList;

import arrayobject.Book;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>(); // 두번째 Book 생략가능
		
		library.add(new Book("book1", "Lee"));
		library.add(new Book("book2", "Lee"));
		library.add(new Book("book3", "Lee"));
		library.add(new Book("book4", "Lee"));
		library.add(new Book("book5", "Lee"));
	
		for(int i = 0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
		
		
	}
}

package interface4;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList(); // 생성자를 호출할 때 리스트를 이니셜라이즈 하는 것이 좋음
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}

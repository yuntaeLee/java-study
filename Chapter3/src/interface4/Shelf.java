package interface4;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList(); // �����ڸ� ȣ���� �� ����Ʈ�� �̴ϼȶ����� �ϴ� ���� ����
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}

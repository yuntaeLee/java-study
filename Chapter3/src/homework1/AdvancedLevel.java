package homework1;

public class AdvancedLevel extends PlayerLevel {
	
	@Override
	void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	void jump() {
		System.out.println("���� jump �մϴ�.");
	}
	
	@Override
	void turn() {
		System.out.println("turn ��������");
	}

	@Override
	void showLevelMessage() {
		System.out.println("****** �߱��� �����Դϴ�. ******");		
	}


}

package homework1;

public class SuperLevel extends PlayerLevel {
	
	@Override
	void run() {
		System.out.println("��û ������ �޸��ϴ�.");
	}

	@Override
	void jump() {
		System.out.println("���� ���� jump �մϴ�.");
	}
	
	@Override
	void turn() {
		System.out.println("turn �մϴ�.");
	}

	@Override
	void showLevelMessage() {
		System.out.println("****** ����� �����Դϴ�. ******");		
	}

}

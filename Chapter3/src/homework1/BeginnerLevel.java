package homework1;

public class BeginnerLevel extends PlayerLevel {

	@Override
	void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	void jump() {
		System.out.println("jump ��������");
	}
	
	@Override
	void turn() {
		System.out.println("turn ��������");
	}

	@Override
	void showLevelMessage() {
		System.out.println("****** �ʱ��� �����Դϴ�. ******");		
	}


}

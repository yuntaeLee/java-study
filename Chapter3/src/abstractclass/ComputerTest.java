package abstractclass;

public class ComputerTest {

	public static void main(String[] args) {

		// 모든 기능을 구현했더라도 abstract로 선언하는 이유는 상속만 할 수 있게 하기 위해
		// abstract method는 new 할 수 없다.
		
		
		Computer desktop = new Desktop(); // 만약 desktop에 추가 메소드가 생기면 사용할 수 없음
//		Desktop desktop1 = new Desktop();
		desktop.display();
		
//		Computer computer = new Computer(); // 사용 x 추상 메소드이기 떄문
		
	}

}

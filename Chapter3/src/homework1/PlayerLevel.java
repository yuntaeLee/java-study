package homework1;

public abstract class PlayerLevel {

	abstract void run();
	abstract void jump();
	abstract void turn();
	abstract void showLevelMessage();
	
	public void go(int jumpCount) {
		run();
		for(int i = 0; i<jumpCount; i++) {
			jump();
		}
		turn();
	}
}

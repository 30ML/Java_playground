package sec06_패키지와_접근_제한자.exam06_Getter와_Setter_메소드_선언;

public class Car {
	// Field
	private int speed;
	private boolean stop;
	
	// Constructor
	
	// Method
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		if (speed <= 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return this.stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}

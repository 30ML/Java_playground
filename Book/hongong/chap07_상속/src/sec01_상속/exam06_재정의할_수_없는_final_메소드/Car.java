package sec01_상속.exam06_재정의할_수_없는_final_메소드;

public class Car {
	// FIELD
	public int speed;
	
	// METHOD
	public void speedUp() { speed += 1; }
	
	// final METHOD
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}

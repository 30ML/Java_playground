package sec01_상속.exam06_재정의할_수_없는_final_메소드;

public class SportsCar extends Car {
	@Override
	public void speedUp() { speed += 10; }
	
	// final method인 stop()를 override 할 수 없음
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}

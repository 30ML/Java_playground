package sec04.exam05_클래스_외부에서_메소드_호출;

public class Car {
	// Field
	int speed;

	// Constructor

	// Method
	int getSpeed() {
		return speed;
	}

	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}

	void run() {
		for (int i = 0; i <= 50; i += 10) {
			speed = i;
			System.out.println("달립니다. (시속: " + speed + "km/h)");
		}
	}
}

package sec02_타입_변환과_다형성.exam03_필드의_다형성;

public class Car {
	// FIELD
	Tire frontLeftTire = new Tire("Front-Left", 6);
	Tire frontRightTire = new Tire("Front-Right", 2);
	Tire backLeftTire = new Tire("Back-Left", 3);
	Tire backRightTire = new Tire("Back-Left", 4);
	
	// CONSTRUCTOR
	
	// METHOD
	int run() {
		System.out.println("[자동차가 달립니다.]");
		
		if (frontLeftTire.roll() == false) { stop(); return 1; }
		if (frontRightTire.roll() == false) { stop(); return 2; }
		if (backLeftTire.roll() == false) { stop(); return 3; }
		if (backRightTire.roll() == false) { stop(); return 4; }
		
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}

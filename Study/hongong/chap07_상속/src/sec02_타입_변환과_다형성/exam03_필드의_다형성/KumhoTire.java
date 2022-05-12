package sec02_타입_변환과_다형성.exam03_필드의_다형성;

public class KumhoTire extends Tire {
	// FIELD
	
	// CONSTRUCTOR
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// METHOD
	public boolean roll() {
		accumulatedRotation += 1;
		
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}

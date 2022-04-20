package sec02_타입_변환과_다형성.exam03_필드의_다형성;

public class Tire {
	// FIELD
	public int maxRotation; // 최대 회전수 
	public int accumulatedRotation; // 누적 회전수 
	public String location; // 타이어의 위치 
	
	// CONSTRUCTOR
	public Tire(String location, int maxRotation) {
		this.location= location;
		this.maxRotation = maxRotation;
	}
	
	// METHOD
	public boolean roll() {
		accumulatedRotation += 1;
		
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}

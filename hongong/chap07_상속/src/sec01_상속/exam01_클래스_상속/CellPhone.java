package sec01_상속.exam01_클래스_상속;

public class CellPhone {
	// FIELD
	String model;
	String color;
	
	// CONSTRUCTOR
	
	// METHOD
	void powerOn() { System.out.println("전원을 켭니다."); }
	void powerOff() { System.out.println("전원을 니다."); }
	void bell() { System.out.println("벨이 울립니다."); }
	void sendVoice(String message) { System.out.println("자기: " + message); }
	void receiveVoice(String message) { System.out.println("상대방: " + message); }
	void hangUp() { System.out.println("전화를 끊습니다."); }
}

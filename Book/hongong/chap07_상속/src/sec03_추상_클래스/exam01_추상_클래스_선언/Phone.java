package sec03_추상_클래스.exam01_추상_클래스_선언;

public abstract class Phone {
	// FIELD
	public String owner;
	
	// CONSTRUCTOR
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// METHOD
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

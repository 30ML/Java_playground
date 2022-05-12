package sec01_인터페이스.exam02_추상_메소드_선언;

public interface RemoteControl {
	// CONSTANT
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// ABSTRACT METHOD
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}

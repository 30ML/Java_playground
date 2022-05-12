package sec01_인터페이스.exam03_구현_클래스;

import sec01_인터페이스.exam02_추상_메소드_선언.RemoteControl;

public class Audio implements RemoteControl {
	// FIELD
	 private int volume;
	
	// CONSTRUCTOR 
	
	// METHOD
	// turnOn() abstract method's concrete method
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	// turnOff() abstract method's concrete method 
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	// setVolume() abstract method's concrete method
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
}

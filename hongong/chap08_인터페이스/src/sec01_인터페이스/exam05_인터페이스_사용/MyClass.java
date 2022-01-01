package sec01_인터페이스.exam05_인터페이스_사용;

import sec01_인터페이스.exam02_추상_메소드_선언.RemoteControl;
import sec01_인터페이스.exam03_구현_클래스.Audio;
import sec01_인터페이스.exam03_구현_클래스.Television;

public class MyClass {
	// FIELD
	RemoteControl rc = new Television();
	
	// CONSTRUCTOR
	MyClass() {}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// METHOD
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}

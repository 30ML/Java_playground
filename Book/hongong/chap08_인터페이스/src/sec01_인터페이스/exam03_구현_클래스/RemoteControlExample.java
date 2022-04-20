package sec01_인터페이스.exam03_구현_클래스;

import sec01_인터페이스.exam02_추상_메소드_선언.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc = new Audio();
	}

}

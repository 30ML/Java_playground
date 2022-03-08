package sec01_인터페이스.exam04_다중_인터페이스_구현_클래스;

import sec01_인터페이스.exam02_추상_메소드_선언.RemoteControl;

public class SmartTelevisionExmaple {
	SmartTelevision tv = new SmartTelevision();
	
	RemoteControl rc = tv;
	Searchable searchable = tv;
}

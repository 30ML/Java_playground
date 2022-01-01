package sec01_인터페이스.exam05_인터페이스_사용;

import sec01_인터페이스.exam03_구현_클래스.Audio;
import sec01_인터페이스.exam03_구현_클래스.Television;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1) ----------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2) ----------------");
		
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3) ----------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4) ----------------");

		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}

}

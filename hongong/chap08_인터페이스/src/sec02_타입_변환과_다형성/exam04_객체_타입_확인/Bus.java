package sec02_타입_변환과_다형성.exam04_객체_타입_확인;

import sec02_타입_변환과_다형성.exam02_매개_변수의_다형성.Vehicle;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}

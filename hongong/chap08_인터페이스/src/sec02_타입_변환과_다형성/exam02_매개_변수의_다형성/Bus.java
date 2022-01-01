package sec02_타입_변환과_다형성.exam02_매개_변수의_다형성;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}

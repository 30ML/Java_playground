package sec02_타입_변환과_다형성.exam01_필드의_다형성;

public class HankookTire implements Tire {
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}

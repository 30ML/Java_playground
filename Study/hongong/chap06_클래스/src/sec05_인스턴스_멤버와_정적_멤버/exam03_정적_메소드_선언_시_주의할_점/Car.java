package sec05_인스턴스_멤버와_정적_멤버.exam03_정적_메소드_선언_시_주의할_점;

public class Car {
	int speed;

	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	public static void main(String[] args) {
		// static method는 instance member를 가질 수 없음
		// 따라서 object를 생성 후 접근해야 함
		Car myCar = new Car();

		myCar.speed = 60;
		myCar.run();
	}

}

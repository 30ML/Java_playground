package sec05.exam01_인스턴스_멤버와_this;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("마세라티");

		myCar.run();
		yourCar.run();
	}

}

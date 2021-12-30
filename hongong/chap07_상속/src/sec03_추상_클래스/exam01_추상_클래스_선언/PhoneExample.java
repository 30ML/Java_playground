package sec03_추상_클래스.exam01_추상_클래스_선언;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone("James"); // Abstract Class
		
		SmartPhone smartPhone = new SmartPhone("James");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}

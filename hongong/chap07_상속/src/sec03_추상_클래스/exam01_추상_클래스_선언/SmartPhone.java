package sec03_추상_클래스.exam01_추상_클래스_선언;

public class SmartPhone extends Phone {
	// CONSTRUCTOR
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// METHOD
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}

package sec03_추상_클래스.exam02_추상_메소드와_재정의;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

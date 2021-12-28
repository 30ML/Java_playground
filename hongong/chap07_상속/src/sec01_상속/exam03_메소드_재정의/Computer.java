package sec01_상속.exam03_메소드_재정의;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer object's areaCircle() call");
		return Math.PI * r * r;
	}
}

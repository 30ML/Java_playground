package sec01_상속.exam03_메소드_재정의;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적: " + computer.areaCircle(r)); // method overriding
	}

}

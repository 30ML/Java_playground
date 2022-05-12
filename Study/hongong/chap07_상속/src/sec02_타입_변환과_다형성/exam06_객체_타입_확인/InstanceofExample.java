package sec02_타입_변환과_다형성.exam06_객체_타입_확인;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child)parent; // ClassCastException 발생 가능성 있음 !!
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); // ClassCastException !!
	}

}

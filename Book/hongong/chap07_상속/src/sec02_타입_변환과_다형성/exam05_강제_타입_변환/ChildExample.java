package sec02_타입_변환과_다형성.exam05_강제_타입_변환;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";
//		parent.method3();
		
		Child child = (Child)parent;
		child.field2 = "data2";
		child.method3();
	}

}
